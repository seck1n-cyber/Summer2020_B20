package day15_String;

public class String_Intro {
    public static void main(String[] args) {

        String str = "Cybertek";
        // Scanner input = new Scanner(System.in);
        String name = "Cybertek";

        //String name2 = new String(original: "Cybertek");

        String s1 = "Cat"; //String literal
        String s2 = "Cat"; //String literal

        System.out.println(s1 == s2);
        //               "Cat" == "Cat"; ===> true

        String d1 = "Dog"; //String literal <--- string pool'a gidiyor ve aynı karakterlerden bı tanesı sadece gider
        String d2 = "dog"; //String literal

        System.out.println(d1 == d2); // false
        //              "Dog" == "dog" ===> false

        //string pool = kopyalanmış karakterleri kabul etmez

        String t1 = "Tiger";
        String t2 = "Tiger";
        System.out.println(t1 == t2);
        //          new String("Tiger") == new String("Tiger") ===> false

        System.out.println("=====================");

        String c1 = "Cybertek"; // String pool
        String c2 = "Cybertek"; //heap
        String c3 = "Cybertek";
        String c4 = "Cybertek"; // String pool
        String c5 = "cybertek"; // String pool ==> case sens


        System.out.println(c1 == c2);
        //              "Cybertek" == newString("Cybertek") ==> false
        System.out.println(c2 == c3); // false
        // new String("Cybertek")  == new String("Cybertek")
        System.out.println(c1 == c4); // ==> true
        //              "Cybertek" == "Cybertek"
        System.out.println(c4 == c5); // ==> false
        //              "Cybertek" == "cybertek"

        System.out.println("=================");
        // INMUTABLE


        String str1 = "Java";
        str1 = "JavaScript";
        System.out.println(str1);
        str1 = "Java";
        System.out.println(str1);

        System.out.println("=================");




    }
}
