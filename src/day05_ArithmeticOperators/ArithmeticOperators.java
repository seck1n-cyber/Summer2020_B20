package day05_ArithmeticOperators;
/*

Arithmetic operators:
                +: addition
                -: subtraction
                *: multiplication
                /: division
                %: remainder
        formula for finding remainder:
                    remainder = numerator - (denominator * whole number of result)
10 + 9 ==> 19
10 - 9 ==> 1
10 * 9 ==> 90
10/2 ==> 5
10/3 ==> 3
10.0/3 ==> 3.333
10/3.0 ==>3.333...
10/3.0 ==> 3.3333...
remainder: 10 - (3 * 3 ) =1
10%3 ==> 1
15 / 3 ==> 5
remainder: 15 - (3*5) = 0
15%3 ==> 0
100 / 3 = 33.33333
remainder: 100 - (3 * 33 )
            100 - 99 = 1
remainder: 100 % 3 = 1

 */

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(20+3-2+1);
                    //23-2+1
                    //(23-2)+1 = 22
                    //soldan saga hesaplar

        System.out.println(20*3);
        System.out.println(2 + 3 - 1 * 4 );
                // her zaman java inglizce gibi soldan
                // saga dogru hesaplar

        System.out.println(10/3);   // int/int --> int
                                    // int kesin sonuc verir
        System.out.println(10.0/3); // double/int olursa double verir

        System.out.println(10/3.0); // int/double olursa double gene


        System.out.println(10%4);
                    //10/4 =2
                    //10-4(4+2)=2

        System.out.println(30%8);
                //  30/8=3 int
                //remainder: 30 - ( 8*3 )
                //           30 - 24 = 6

        System.out.println(99%4);
                //  99/4 = 24
                // 99 - 96 = 3







    }
}
