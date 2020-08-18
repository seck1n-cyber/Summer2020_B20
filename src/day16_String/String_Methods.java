package day16_String;
import java.util.Scanner;
public class String_Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // replace method

        String email = "cybertek@gmail.com";

        email = email.replace("gmail", "yahoo"); // <==== "cybertek@yahoo.com"

        System.out.println(email);

        String word = "java";
         word = word.replace("a","e"); // <======= jeve

        System.out.println(word);

        String sentence = "I like to learn Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java", "a, C#");
        sentence = sentence.replace("Java ","Python ");

        System.out.println(sentence);


        /*replace practice2   <======= sadece replace methodu hepsini değiştirir
                                        replaceFirst Methodu ilkini değiştirir.
                                        */

        String s1 = "I like to stay in Cybertek, Cybertek is nice place";
        s1 = s1.replace("Cybertek", "MIT");

        System.out.println(s1);

        s1 = s1.replace("MIT","Cybertek");

        System.out.println(s1);

        String s2 = "I like to LeaRn Java, we aRe enjoying Java"; //r

        s2 = s2.replace('R', 'r');
        System.out.println(s2);
        System.out.println("=============");

        //replaceFirst:

        String s3 = "I like to drink tea and tea";
               s3 = s3.replaceFirst("tea", "cola"); // "I like to drink cola and tea
                                                                   // ilk yazılan tea'yi değiştirir
        System.out.println(s3);

        String s4 = "I like to Watch Game Of Thrones, and Walking dead";
               s4 = s4.replaceFirst(", and Walking dead", "."); // I like to Watch Game Of Thrones.
        System.out.println(s4);


        System.out.println("===============");

        //indexOf() Methodu indexOf(value)
        // String yeri = "Cybertek";
        // int r1 = yeri.indexOf("r"); <== kelimenin içindeki harfin sayısını(yerini) bulmak için

        String s5 = "I like to stay in Cybertek, we are learning java";

        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re"); // returns the first char 'r' index
        int r3 = s5.indexOf("rn"); // returns the first char 'r' index

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        //LastİndexOf()

        String s6 = "Java is a programming language, and Java is fun"; // son yazdıgın  J yi bulma
        int    j1 =  s6.lastIndexOf("J"); // sonuncusunu bulma
        int    j2 =  s6.indexOf("Java is fun");

        System.out.println(j1);
        System.out.println(j2);


        String s7  = "Java";  // invalid karakteri bulmak için
        int a1 = s7.indexOf("A");

        System.out.println(a1);

        String s8 = "Java";
        int a = s8.indexOf("a");

        char ch = s8.charAt(a);

        System.out.println(a);








    }
}
