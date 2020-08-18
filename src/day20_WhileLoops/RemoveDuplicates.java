package day20_WhileLoops;
/*
write a program that can remove the duplicates from any given string
ex :
input : abcabcaabb
output: abc
 */

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "aabb"; // "ab"
        //            0123
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            String s = "" + str.charAt(i); // a, a, b, b
            if (!result.contains(s)) {
                result += s;
            }
        }
        System.out.println(result);


    }
}
