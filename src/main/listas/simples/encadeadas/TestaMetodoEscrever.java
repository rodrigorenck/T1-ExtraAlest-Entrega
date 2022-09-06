package listas.simples.encadeadas;

public class TestaMetodoEscrever {

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

        System.out.println("Escrevendo valor [100] na posicao [0]");
        lista.escrever(0, 100);
        System.out.println(lista);
        System.out.println();


        System.out.println("Escrevendo valor [-10] na posicao [4]");
        lista.escrever(4, -10);
        System.out.println(lista);
        System.out.println();

        System.out.println("Escrevendo valor [28] na posicao [5]");
        lista.escrever(lista.tamanho()-1, 28);
        System.out.println(lista);
        System.out.println();

        System.out.println("Escrevendo valor [3] na posicao [1]");
        lista.escrever(1, 3);
        System.out.println(lista);
        System.out.println();

        System.out.println("Escrevendo valor em posicao invalida");
        try{
            lista.escrever(10, 10000);
        }catch (Exception e){
            System.out.println("Excecao lancada!");
            System.out.println(lista);
            System.out.println();
        }
    }
}
