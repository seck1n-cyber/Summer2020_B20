package day14_Recap;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender");
        String gender = input.next();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your Country: ");
        String country = input.nextLine();

        System.out.println("Enter your zipcode: ");
        int zipcode = input.nextInt();

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your Company name: ");
        String companyName = input.nextLine();

        System.out.println("Gender is: \n\n"+gender+" \n\nAge is:" +
                " \n\n"+age+" \n\nCountry is: \n\n"+country+"" +
                " \n\nZipcode is: \n\n"+zipcode+" \n\nFull Name is: " +
                " \n\n"+fullName+" \n\nCompany name is: \n\n"+companyName);






    }
}
