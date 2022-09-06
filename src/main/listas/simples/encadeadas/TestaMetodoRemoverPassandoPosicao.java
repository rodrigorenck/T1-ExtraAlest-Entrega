package listas.simples.encadeadas;

public class TestaMetodoRemoverPassandoPosicao {

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
        lista.removerPelaPosicao(0);
        System.out.println(lista);
        System.out.println();

        //removendo elemento no meio
        System.out.println("Removendo elemento no meio");
        lista.removerPelaPosicao(2);
        System.out.println(lista);
        System.out.println();

        //removendo ultimo elemento
        System.out.println("Removendo ultimo elemento");
        lista.removerPelaPosicao(3);
        System.out.println(lista);
        System.out.println();


        System.out.println("Removendo elemento no meio");
        lista.removerPelaPosicao(1);
        System.out.println(lista);
        System.out.println();

        System.out.println("Removendo posicao que nao esta na lista");
        try{

            lista.removerPelaPosicao(4);
        }catch (Exception e){
            System.out.println("Excecao lancada!");
            System.out.println(lista);
            System.out.println();
        }

        System.out.println("Removendo ultimo elemento");
        lista.removerPelaPosicao(lista.tamanho()-1);
        System.out.println(lista);
        System.out.println();

        System.out.println("Removendo elemento que restou");
        lista.removerPelaPosicao(0);
        System.out.println(lista);
    }
}
