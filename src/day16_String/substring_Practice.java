package day16_String;
import java.util.Scanner;
/*
1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */

public class substring_Practice {
    public static void main(String[] args) {
        // extra task:
        String str   = "I like to drink Pepsi";
        //              0123456789.....16(P)'den sonrasını yazdırmak için kod
        String drink = str.substring(16);
        System.out.println(drink);

        String action = str.substring(10,14+1);
        System.out.println(action);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first String");
        String str1 = scan.next();  //"Apple"

        System.out.println("Enter your second word");
        String str2 = scan.next(); //"Banana"

        //ppleanana
        //String result = str1.substring(1) + str2.substring(1);

        String result = str1.substring(1) + str2.substring(1);

        System.out.println(result);


    }
}
