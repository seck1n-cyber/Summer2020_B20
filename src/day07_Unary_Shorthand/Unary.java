package day07_Unary_Shorthand;

public class Unary {
    public static void main(String[] args) {
        System.out.println(-1 + -10);
                        // -1 - 10 ==> -11

        System.out.println(-11 -  -10);


        System.out.println("============");

        // -- ; // decreases value of varaible by 1 -- tek tek sayı çıkarma


        int a = 20;
        // a= a-1; // 19

        --a;
        System.out.println(a);

        System.out.println("===========");

        // ++ ; // increases the value of variable by 1 -- tek tek artı 1 ekleme
        int b = 10;
        //b = b + 1; // b = 11;

        ++b;

        System.out.println(b);

        System.out.println("=========");

        //pre:


        int x = 100;

        System.out.println(++x); // 101


        int y = 200;

        System.out.println(--y);

        //post; postphone place the increament/decreament operators before variable
        // daha sonradan komutu sağlıyor

        //first passes the current value, then next step increases/decrases value by 1








    }
}
