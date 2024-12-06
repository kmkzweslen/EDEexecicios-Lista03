package ifma.lista03;

public class SimpleList {
    private Node head;

    public SimpleList() {
        this.head = null;
    }

    public void adicionarInicio(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void adicionarFim(int data) {
        if (head == null) {
            adicionarInicio(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public int removerComeco() {
        if (head == null) {
            throw new RuntimeException("A lista está vazia");
        } else {
            int data = head.data;
            head = head.next;
            return data;
        }
    }

    public int removerFinal() {
        if (head == null) {
            throw new RuntimeException("A lista está vazia");
        } else if (head.next == null) {
            return removerComeco();
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            int data = current.next.data;
            current.next = null;
            return data;
        }
    }

    public int maiorValor() {
        if (head == null) {
            throw new RuntimeException("A lista está vazia");
        }
        int maior = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data > maior) {
                maior = current.data;
            }
            current = current.next;
        }
        return maior;
    }

    public int menorValor() {
        if (head == null) {
            throw new RuntimeException("A lista está vazia");
        }
        int menor = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data < menor) {
                menor = current.data;
            }
            current = current.next;
        }
        return menor;
    }

    public double mediaValores() {
        if (head == null) {
            throw new RuntimeException("A lista está vazia");
        }
        int soma = 0;
        int count = 0;
        Node current = head;
        while (current != null) {
            soma += current.data;
            count++;
            current = current.next;
        }
        return (double) soma / count;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
