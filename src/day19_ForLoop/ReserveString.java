package day19_ForLoop;

public class ReserveString {
    public static void main(String[] args) {

        String str = "Cyber"; //"rebyC"
        //            01234

       // String result = ""+str.charAt(str.length()-1 )+ str.charAt(3) +
         //               str.charAt(2) + str.charAt(1) + str.charAt(0);

        String result = "";
        for(int i = 4; i >= 0; i--){ //i : 4,3,2,1
            result += str.charAt(i);
        }


        System.out.print(result);



    }
}
