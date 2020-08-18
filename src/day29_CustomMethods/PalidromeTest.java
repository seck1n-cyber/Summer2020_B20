package day29_CustomMethods;

public class PalidromeTest {
    /*
    kayak ==> kayak true
    java ==> avaJ false
     */

    public static void main(String[] args) {
        palindrome("Redivider"); /// ====> true
        palindrome("Cybertek"); ///===>>>> false
    }
    public static void palindrome(String word){
        String reversed = "";
        for(int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }

        System.out.println(reversed.equalsIgnoreCase(word));

    }


}
