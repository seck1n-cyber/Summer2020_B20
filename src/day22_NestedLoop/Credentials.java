package day22_NestedLoop;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name");
        String u = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        while (!(u.equals("cyber") && p.equals("tek123")))
            System.out.println("Invalid user name or password, Please re-enter");
            System.out.println("Enter your user name");
            u = scan.next();

        System.out.println("Enter your password");
        p = scan.next();
        


    }
}
