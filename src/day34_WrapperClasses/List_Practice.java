package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }

        System.out.println(oddList);
        System.out.println();
        System.out.println(evenList);

        System.out.println("=================");


        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Milk");        //0
        groceryList.add("Apple");       //1
        groceryList.add("Eggs");        //2
        groceryList.add("Mango");       //3
        groceryList.add("Ice Cream");   //4

        for (int i = groceryList.size() - 1; i >= 0; i--) { // .size() - 1; last index  için
            System.out.print(groceryList.get(i) + "  ");
        }
        System.out.println();

        for (String each :groceryList ) {
            System.out.print(each+ "  ");
        }







    }
}
