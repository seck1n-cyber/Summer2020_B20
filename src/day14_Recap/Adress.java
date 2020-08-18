package day14_Recap;
import java.util.Scanner;
public class Adress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your building number:");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street address: ");
        String streetAdress = scan.nextLine();


        System.out.println("Enter your city name: ");
        String cityName = scan.nextLine();

        System.out.println("Enter your State: ");
        String stateName = scan.next();

        System.out.println("Enter your zipcode: ");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println(fullName+"\n"+buildingNumber+
        " "+streetAdress+"\n"+cityName+", "+stateName+" "+zipCode);

        /*
        System.out.println("building number is: \n\n"+buildingNumber+" \n\nStreet Adress is:"
         +" \n\n"+streetAdress+" \n\nCity Name is: \n\n"+cityName+"" +
         " \n\nState Name is: \n\n"+stateName+" \n\nZip Code is: " +
         " \n\n"+zipCode+" \n\nFull Name is: \n\n"+fullName);*/
        scan.close();



    }
}
