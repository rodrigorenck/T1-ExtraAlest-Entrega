package listas.simples.estaticas;

public class TestaRemove {


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

        System.out.println("Removendo ultimo elemento");
        listArray.remove(50);
        System.out.println(listArray);
        System.out.println();

        System.out.println("Removendo primeiro elemento");
        listArray.remove(10);
        System.out.println(listArray);
        System.out.println();

        System.out.println("Removendo elemento do meio");
        listArray.remove(30);
        System.out.println(listArray);
        System.out.println();

        System.out.println("Removendo elemento inexistente");
        listArray.remove(10000);
        System.out.println(listArray);
        System.out.println();



        System.out.println("Removendo primeiro elemento");
        listArray.remove(20);
        System.out.println(listArray);
        System.out.println();

        System.out.println("Removendo elemento que sobrou");
        listArray.remove(40);
        System.out.println(listArray);
        System.out.println();
    }
}
