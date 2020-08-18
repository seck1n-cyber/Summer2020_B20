package turklerinDersleri;
import java.util.Scanner;

public class ders2_06_27_2020 {

    public static void main(String[] args) {

        String ta = "A";

        ta = ta.concat("B");    //ta --> A B
        String tb = "C";        //tb --> C
        ta = ta.concat(tb);    //ta --> A B C
        ta.replace('C','D'); //
        ta = ta.concat(tb);
        System.out.println(ta);

    }
}
