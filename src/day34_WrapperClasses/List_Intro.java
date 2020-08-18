package day34_WrapperClasses;
import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
            scores.add(95);   // 0 -------autoBoxing int otomatik
            scores.add(100);  // 2
            scores.add(85);   // 3
            scores.add(75);   // 4
            scores.add(1,65);  // 1

        System.out.println(scores);

        System.out.println(scores.get(2) ); // print's index number

        System.out.println(scores.size());






    }
}
