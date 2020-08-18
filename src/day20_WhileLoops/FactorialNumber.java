package day20_WhileLoops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = 1;

        for(int i = scan.nextInt(); i >= 1; i-- ){
            result *= i;
        }

        System.out.println(result);
    }
}
