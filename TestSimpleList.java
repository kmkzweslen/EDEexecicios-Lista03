package ifma.lista03;

public class TestSimpleList {
    public static void main(String[] args) {
        SimpleList list = new SimpleList();

        list.adicionarInicio(3);
        list.adicionarFim(5);
        list.adicionarInicio(2);
        list.adicionarFim(8);

        System.out.println("Lista: " + list);

        System.out.println("Remover do começo: " + list.removerComeco());
        System.out.println("Lista após remoção: " + list);

        System.out.println("Remover do final: " + list.removerFinal());
        System.out.println("Lista após remoção: " + list);

        System.out.println("Maior valor: " + list.maiorValor());
        System.out.println("Menor valor: " + list.menorValor());
        System.out.println("Média dos valores: " + list.mediaValores());
    }
}
