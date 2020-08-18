package day14_Recap;
import java.util.Scanner;
public class ScannerMethods {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //int num = input.nextInt();
        //double num = input.nextDouble();
        //boolean num = input.nextBoolean();
        System.out.println("Do you want to learn Java?");
        //String num = input.next(); <-------- sadece ilk kelimeyi gösterir
        String num = input.nextLine(); // <<<------ bu her yazdığını çıkarır

        System.out.println("You have enterered "+num);



    }
}
