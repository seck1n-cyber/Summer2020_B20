package day06_ComparisonOperators;

public class RelationalOperators {
    public static void main(String[] args) {

        boolean r1 = 10 > 9;
        System.out.println(r1);

        boolean r2 = 100 < 9900;
        System.out.println(r2);

        // >= ---> büyük veya eşit- greater or equal

        boolean r3 = 87 >= 85;
        System.out.println(r3);

        boolean r4 = 877 >= 878;
        System.out.println(r4);

        //<= kücüktür veya eşit

        boolean r5 = 200 <= 300;
        System.out.println(r5);


        // == eşit -- equal

        boolean r6 = 900 == 800;

        System.out.println(r6);

        boolean r7 = true == false;
        System.out.println(r7);

        boolean r8 = "Muhtar" == "Good Guy";
        System.out.println(r8);

        boolean r9 = "muhtar" == "MUHTAR";
        System.out.println(r9);

        //boolean r10 = "123" = 123; biri yazı biri sayı

        //!= not equal - eşit değil

        boolean r11 = "Muhtar" != "Bad Guy";
        System.out.println(r11);

        boolean r12 = true != false;
        System.out.println(r12);


        boolean result1= 'A' == 65;
        System.out.println(result1);

        boolean result2 = 100 == 100.0; //100$ or $100.0 is same
        System.out.println(result2);

        boolean result3 = 10 == (int)10.9999999999; // int atarsak eger eşit olur

        System.out.println(result3);

        boolean result4 = "100" == "100.0"; // false
        System.out.println(result4);

        //even: 101%2 ==0
        //odd : 101%2 !=0
        int number = 101;

        boolean even = number%2 == 0;
        boolean odd = number%2 != 0;
        System.out.println(even);
        System.out.println(odd);

         // int x = 1000;
        //odd: x%2 !=0; =======> false
        //even: x%2 ==0; ========> true

        //=========================

        //divisible by 3: x%3 == 0; =====> false
        //divisible by 5: x%5 == 0; =====> true
        //divisible by 10: x%10 == 0; =====> true







    }
}
