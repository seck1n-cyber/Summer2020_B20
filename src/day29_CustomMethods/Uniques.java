package day29_CustomMethods;

public class Uniques {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C"};

        int count = 0;
        for(String a : arr){ // gets the frequency of the element
            for(String each : arr ){
                if(a == each){
                    count++;
                }
            }
            if(count == 1 ){ // unique
                System.out.println(a+" ");
            }
        }






    }
}
