package day28_Recap;

public class FrequencyOfWord_Array {
    public static void main(String[] args) {

        String[] arr = {"Java", "C#", "Pyhton", "Java"};
        String word = "java";

        int count = 0;

        for(String each : arr ){
            if(word.equalsIgnoreCase(each)){
                count++;
            }
        }

        System.out.println(count);
    }
}
