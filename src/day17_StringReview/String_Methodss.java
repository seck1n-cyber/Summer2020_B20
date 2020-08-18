package day17_StringReview;

import java.util.Scanner;

public class String_Methodss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //charAt(index); ==> char
        String str = "Cybertek";
        //            01234567

        char ch1 = str.charAt(1);
        System.out.println(ch1);

        //+: ==> concat

        String str2 = "Cybertek";
        str2 = str2 + " School";
        System.out.println(str2);

        //length()  ==> int

        String str3 = "Cybertek School";
        //             01234567


        int l = str3.length(); //16
        System.out.println(l);

        //lastİndex: length() -1
        char ch2 = str3.charAt(l - 1);
        System.out.println(ch2);
        System.out.println("last index: " + (l - 1));

        //uppercase & lowercase

        String str4 = "cybertek";
        str4 = str4.toUpperCase();

        System.out.println(str4);

        String str5 = "JAVA";
        str5 = str5.toLowerCase();

        System.out.println(str5);

        //trim()  gereksiz boşlukları siliyor

        String str6 = "    Cybertek    SchoOOl   ";
        System.out.println(str6);

        str6 = str6.trim();
        System.out.println(str6);

        //Substring()

        String str7 = "I Like Java Language"; // kendisine assign edersek sorun olur
        //             0123456789....            yeni bir yazıya assign edebilrsin
        String word = str7.substring(7, 10 + 1);
        System.out.println(word); // Java

        String word2 = str7.substring(12); // sadece rakam yazarsak rakamdan sonrasını printler
        System.out.println(word2);                          //str7.length()-1 son karakterden 1 öncesini printler


        String word3 = str7.substring(2, 5 + 1);
        System.out.println(word3);

        //indexOf & LastIndexOf ==> INT
        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int w1 = str8.indexOf("W"); // karakterin yerini buluyor
        System.out.println(w1);
        System.out.println(str8.charAt(w1)); //karakterin yerini bulduktan sonra confirm yapıyor

        int w2 = str8.indexOf("We are");

        System.out.println(w2);

        String str9 = "Java Java Java";
        int i4 = str9.lastIndexOf("J"); // son indexi gösteriyor
        int i5 = str9.indexOf("J"); //ilk baştakini gösteriyor
        int i6 = str9.indexOf(" Java") + 1;
        int i7 = str9.lastIndexOf("Java ");

        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);

        // replace && replaceFirst ==> replace hepsini, replaceFirst sadece ilkini

        String s1 = "I Like Java, Java is a programming language";
        s1 = s1.replace("Java", "C#");
        System.out.println(s1);


        String s2 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java", "C#");
        System.out.println(s2);


        String s3 = "I like Java, Java is a programming language";
        s3 = s3.replace("Java is", "C# is");
        System.out.println(s3);


    }
}
