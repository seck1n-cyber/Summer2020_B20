package day16_String;
import java.util.Scanner;
public class FirstLastCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.next();
        scan.close();

        char firstChar = word.charAt(0); // ilk harfı getirmek için kullanılan kod
        char lastChar  = word.charAt(word.length() -1); // son harfi getirmek için

        //System.out.println(firstChar == lastChar ); ===> easy way

        if (firstChar == lastChar) {    // üsttekini daha kolay
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
