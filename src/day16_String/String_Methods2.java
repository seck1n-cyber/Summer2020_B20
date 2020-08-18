package day16_String;

public class String_Methods2 {
    public static void main(String[] args) {

        //isEmpty()

        String name1 = "Cybertek";
        System.out.println(name1.isEmpty() );

        String name2 = "";

        System.out.println(name2.isEmpty() );


        //equals(str):


        String str1 = "Java"; //string pool
        String str2 = new String("Java"); //heap

        System.out.println(str1+" : "+str2);
        System.out.println(str1 == str2); //false

        System.out.println(str1.equals(str2) ); //true


        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str3 == str4); //false
        System.out.println(str3.equals(str4) ); //true

        String str5 = "Java";
        String str6 = "Java";

        System.out.println( str5 == str6 ); //true
        System.out.println(str5.equals(str6) ); //true

        String str7 = "JAVA";
        String str8 = "java";
        System.out.println(str7.equals(str8) ); //false


        //equalsIgnoreCase(str): //can ignore case sensivity
        //yES, YES, yEs, yeS <== all same

        String str9 = "JAVA";
        String str10= "java";
        System.out.println(str9.equalsIgnoreCase(str10)); // true

        //contains(); //kelimeleri kontrol ediyor varmı yokmu diye

        String str = "I like to learn java programing language";

        System.out.println(str.contains("python") );  //false
        System.out.println(!str.contains("python") ); //true

        System.out.println(str.contains("java") ); //true
        System.out.println(str.contains("JAVA") ); //false

        //startsWith(str); // başlangıc karakterlerini kontrol ediyor

        String s1 = "Seckin";
        System.out.println( s1.startsWith("S") ); //true
        System.out.println( s1.startsWith("C") ); //false

        System.out.println( s1.startsWith("Se") ); // true
        System.out.println( s1.toLowerCase().contains("se") );

        //endsWith

        String s2 = "Seckin";
        System.out.println(s2.endsWith("in") ); //true



















    }
}
