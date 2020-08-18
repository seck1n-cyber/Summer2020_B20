package sinavYeri;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below


        String str = "";
        for(int i=0; i<word.length(); i++){
            str += str.charAt(i);
            System.out.println("hello");
        }
        
        for(int i=0; i<word.length(); i++){

            System.out.println(word.charAt(i));
        }



    }
}
