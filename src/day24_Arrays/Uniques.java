package day24_Arrays;

public class Uniques {
    public static void main(String[] args) {
        String str = "aabcc";

        String uniques = ""; //unique karakterlerini saklıcaz buraya.

        for(int i = 0; i <= str.length()-1; i++){
            char ch = str.charAt(i);            // a a b c c ( 5 harf 0 dan başlar)
            int first = str.indexOf(ch);        // 0 0 2 3 3 (sadece b unique)
            int last = str.lastIndexOf(ch);     // 1 1 2 4 4

            if(first == last){
                uniques += ch;
            }

        }

        System.out.println(uniques);







    }
}
