package day18_forLoops;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
/*

        String initial = firstName.substring(0,1) + "." + lastName.substring(0,1);
            initial = initial.toUpperCase();
        System.out.println(initial);


 */

        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);

        String initial = ""+ch1+ch2;
        System.out.println(initial);


    }
}
