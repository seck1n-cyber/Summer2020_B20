package Office_Hours.Practice_07_06_2020;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        // 1. question


        String str= " ";
        str = str.trim(); // ""

        System.out.println(str.isEmpty());

        System.out.println("=========");
        // question 2

        String ta = "A";
        ta = ta.concat("B"); //A B
        String tb = "C";
        ta = ta + tb; //" A B C "
        ta.replace('C','D'); // " A B D "
        ta = ta + tb; // A B C C

        System.out.println(ta);
        System.out.println("=======");

        // question6


        String s1 = "abc";
        String s2 = "abc";

        System.out.println("s1 == s2 is: "+ s1 == s2);
        //                 "s1 == s2 is : abc" == "abc" not equal <== false





    }
}
