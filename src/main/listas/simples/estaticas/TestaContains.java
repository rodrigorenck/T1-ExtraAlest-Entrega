package listas.simples.estaticas;

public class TestaContains {


    public static void main(String[] args) {


        ListArray listArray = new ListArray();

        listArray.add(10);
        listArray.add(20);
        listArray.add(30);
        listArray.add(40);
        listArray.add(50);

        System.out.println(listArray);

        System.out.println(listArray.contains(10));
        System.out.println(listArray.contains(50));
        System.out.println(listArray.contains(20));

        System.out.println(listArray.contains(-10));
        System.out.println(listArray.contains(0));

    }
}
