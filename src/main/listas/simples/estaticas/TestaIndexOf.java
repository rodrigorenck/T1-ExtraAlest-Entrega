package listas.simples.estaticas;

public class TestaIndexOf {


    public static void main(String[] args) {


        ListArray listArray = new ListArray();

        listArray.add(10);
        listArray.add(20);
        listArray.add(30);
        listArray.add(40);
        listArray.add(50);

        System.out.println("Lista inicial");
        System.out.println(listArray);
        System.out.println();

        System.out.println("Index do 50: " + listArray.indexOf(50));
        System.out.println("Index do 20: " + listArray.indexOf(20));
        System.out.println("Index do 10: " + listArray.indexOf(10));
        System.out.println("Index do 1000: " + listArray.indexOf(1000));
    }
}
