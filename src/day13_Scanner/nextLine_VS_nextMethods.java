package day13_Scanner;
import java.util.Scanner;
public class nextLine_VS_nextMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

        scan.nextLine();
        // takes everything that the scaner has. even the tnter. returns string
        // hepsinin üst üste yazdırırsa araya nextline methodunu ekle

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("Full name: "+fullName);


    }
}
