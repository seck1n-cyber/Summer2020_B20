package day07_Unary_Shorthand;

public class ShortHand {
    public static void main(String[] args) {
        /*
        ShortHand Operators: =, +=, -=, *=, /=, %=



            //=: assignment

            //int a = 200;
            //  a = 400;

            // +=: addition assignment

            //int a = 200;
            //a = a + 100; ====> 300
            //or
            // int b = 200;
            // b += 100; ===> 300;

            //-= : subtraction assignment
            //int a = 200;
            // a=a-50; ===> 150

            // int b = 200;
            // b-=50; ==> 150

            //*= : multiplication assignment




        */


        int a = 100;
        //a = a*a;
        a *= a;
        System.out.println(a);

        int b = 2;
        b *= 3;
        System.out.println(b);

        int c = 300;
        c -= 100;
        System.out.println(c);


        System.out.println("=======");


        //additional +=;

        int z = 300;
        z += 200; // z = z +200

        System.out.println(z);

        String schoolName = "Cybertek";
        // schoolName = schoolName + " School";
        schoolName += " School";
        System.out.println(schoolName);


        String fullName = "Donald";
                fullName += " Trump";

        System.out.println(fullName);

        String fullNaame = "Müslüm";
                fullNaame += " BABA";
        System.out.println(fullNaame);


        // /= : division assignment

        int budget = 100000;
            budget /= 4; // budget = budget / 4;
        System.out.println(budget);

        System.out.println("=========");

        //
        int q = 100;
        System.out.println(q/2); //50
        System.out.println(q);  //100

        int x = 100;
            x /= 2;
        System.out.println(x);

            x *= 2;
        System.out.println(x);


        // %=

        int num = 100;
            num %= 3;
        System.out.println(num); // 1

        double num2 = 400.2;
               num2 %= 2;
        System.out.println(num2); //


        // OPERATORS ;

        //boolean : ==, !=, >, <, <=, >=,
        // +,-,/,*,%, --,++, +=, -=, *=, /=, %=, =

        








    }
}
