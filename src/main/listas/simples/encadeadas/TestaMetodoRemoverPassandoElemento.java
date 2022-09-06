package listas.simples.encadeadas;

public class TestaMetodoRemoverPassandoElemento {

    public static void main(String[] args) {
        ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();

        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.adicionar(40);
        lista.adicionar(50);
        lista.adicionar(60);

        System.out.println("Lista Inicial");
        System.out.println(lista);
        System.out.println();

        //removendo primeiro elemento
        System.out.println("Removendo primeiro elemento");
        lista.remover(10);
        System.out.println(lista);
        System.out.println();

        //removendo elemento no meio
        System.out.println("Removendo elemento no meio");
        lista.remover(40);
        System.out.println(lista);
        System.out.println();

        //removendo o ultimo elemento
        System.out.println("Removendo ultimo elemento");
        lista.remover(60);
        System.out.println(lista);
        System.out.println();

        //removendo elemento que nao esta na lista
        System.out.println("Removendo ultimo elemento");
        lista.remover(50);
        System.out.println(lista);
        System.out.println();

        System.out.println("Removendo primeiro elemento");
        lista.remover(20);
        System.out.println(lista);
        System.out.println();

        //removendo elemento que nao esta na lista
        System.out.println("Removendo elemento que nao esta na lista");
        lista.remover(1000);
        System.out.println(lista);
        System.out.println();

        //removendo ate a lista ficar vazia
        System.out.println("Removendo ultimo elemento");
        lista.remover(30);
        System.out.println(lista);
        System.out.println();


    }
}
