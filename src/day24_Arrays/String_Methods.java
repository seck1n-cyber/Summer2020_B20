package day24_Arrays;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {
        String str = "ABCD";
        char[] ch  = str.toCharArray();

        System.out.println(  Arrays.toString(ch) );

        System.out.println("========");

        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();


    }
}
