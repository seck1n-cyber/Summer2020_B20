package Office_Hours.Practice_06_23_2020;

public class IfStatements_Quiz {
    public static void main(String[] args) {
        // Question 2

        int score = 0;

        if (score == 0) {
            // 0 == 0 ==> true
            score += 50;   // score = score + 50; = 50;

        }
        if (score != 0) {
          // 50   != 0 ==> true
            score += 50; // score = 100
        }
        System.out.println(score);
        System.out.println("============");


        // question 3


        char grade = 'A';
        boolean passed = grade == 'A' || grade == 'B';
        //                'A'  == 'A' || or işareti varsa ve herhangi birisi true ise her zaman true olur
        //                   true

        boolean passed2 = grade == 'C' || grade == 'D';
        //                  'A' == 'C' ||  'A'  ==   D
        //                      false  ||    false =====> false

        if (passed || passed2) {
          // true  || false ===> true çünkü || or işaretindeki herhangi birisi true olursa hepsi true olur
            System.out.println("You passed the exam");
        }else{
            System.out.println("You failed");
        }

        System.out.println("=============");

        // Question 9

        int number = 10;
        if (--number > 10) {
          // 9 > 10 ===> false
            System.out.println("Hello Cybertek"+number);
        }else{
            System.out.println("Hello World "+number);
        }

        System.out.println("===========");

        // Question 10


        boolean X = true;
        boolean Y = !X   == false; // ==> true
        //         false == false ==> true

        boolean Z = Y; // true

        if ( X ) {
            System.out.println("Hello");
        }
        if ( Y ) {
            System.out.println("Today");
        }
        if (Z) {
            System.out.println("Bye");
        }
        System.out.println("===========");


        // question 10

        int x = 10;
        int y = x++;

        //  H = 10, G = 11

        System.out.println(y++ + " " + x++ + " " + y);
        //                  10 +" " + 11  + " " + 11





    }
}
