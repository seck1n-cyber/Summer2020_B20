package day07_Unary_Shorthand;

public class Post_VS_Pre {
    public static void main(String[] args) {

        int a = 10;
        System.out.println( ++a ); // 11 hemen değeri ekler
        System.out.println(a); //11 same

        System.out.println("'='='='='='='='");

        int b = 10;
        System.out.println(b++); //10
        System.out.println(b); //11

        System.out.println("=======é=é=é=é=é=");
         int c = 25;
         int d = c++;
        System.out.println(d);   //25
        System.out.println(c);   //26

        System.out.println("============");


        int e = 25;
        e++;
        System.out.println(e);

        System.out.println("=============");

        int x = 8;
        int y = x--;
        System.out.println(y); // y = 8
        System.out.println(x); // x = 7

        System.out.println("==========");
        int z = 50;
        z = --z + z++ + z-- + z++;
        System.out.println(z);

        System.out.println("==========");

        int A = 1;
        a = -A-- + A++ / -A-- * --A;
        System.out.println(A);













    }
}
