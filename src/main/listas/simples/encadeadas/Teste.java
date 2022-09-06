package listas.simples.encadeadas;

public class Teste {

    public static void main(String[] args) {
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();

        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.adicionar(40);
        lista.adicionar(50);
        lista.adicionar(60);

        System.out.println(lista);

        //removendo primeiro elemento
        lista.remover(60);
        System.out.println(lista);

        lista.remover(50);
        System.out.println(lista);

        lista.remover(40);
        System.out.println(lista);
        System.out.println(lista.tamanho());

        lista.remover(50);
        System.out.println(lista);
        System.out.println(lista.tamanho());
    }
}
