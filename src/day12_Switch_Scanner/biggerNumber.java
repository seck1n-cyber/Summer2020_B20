package day12_Switch_Scanner;
/*
do not use IF statements
 */
public class biggerNumber {
    public static void main(String[] args) {
        double n1 = 100;
        double n2 = 200;
        double n3 = 300;

        boolean n1IsBigger = n1 > n2 && n1 > n3;
        boolean n2IsBigger = n2 > n1 && n2 > n3;
        //n1IsBigger == false && n2 > n3;
        boolean n3IsBigger = !n1IsBigger && !n2IsBigger;
        //n3 > n1 && n3 > n2;
        //n1IsBigger == false && n2IsBigger == false;
        /*
        String result = "";

        if(n1IsBigger){
            result = "n1 is bigger";
        } else if (n2IsBigger) {
            result = "n2 is bigger";
        }else{
            result = "n3 is bigger";
        }


         */


        String result = (n1IsBigger) ? "n1 is bigger" : (n2IsBigger) ? " n2 is bigger " : "n3 is bigger";
        System.out.println(result);

    }
}









