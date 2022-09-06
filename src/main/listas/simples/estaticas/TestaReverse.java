package listas.simples.estaticas;

public class TestaReverse {


    public static void main(String[] args) {


        ListArray listArray = new ListArray();

        listArray.add(10);
        listArray.add(20);
        listArray.add(30);
        listArray.add(40);
        listArray.add(50);
        listArray.add(60);

        System.out.println("Lista inicial");
        System.out.println(listArray);
        System.out.println();

        System.out.println("Lista reverse");
        listArray.reverse();
        System.out.println(listArray);
    }
}
