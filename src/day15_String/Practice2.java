package day15_String;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.next(); // seckin

        System.out.println("Enter your last name: ");
        String lastName = scan.next(); // kara

        //String fullName = firstName.concat(" ".concat(lastName) ); // "SeckinKara"
        String fullName = firstName+" "+lastName;

       // System.out.println( "Your full name is: ".concat(fullName ) );
        System.out.println("Your full name is: "+ fullName);



    }
}
