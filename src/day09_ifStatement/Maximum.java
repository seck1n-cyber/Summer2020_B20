package day09_ifStatement;
/*
Write a java program that accepts three numbers and return the maximum number
(assume that none of them are equal)
3 numaradan aralarındaki en yüksek sayıyı bulma
 */
public class Maximum {
    public static void main(String[] args) {
        double a = 500;
        double b = 200;
        double c = 1000;

        boolean aIsMax = a > b && a > c;
        //              500>200 && 500>1000
        //               true && false ===> false

        boolean bIsMax = b > a && b > c;
        //              aIsMax == false && b > c; ==> boylede kullanabiliriz

        boolean cIsMax = !aIsMax && !bIsMax; // !(aIsMax && bIsMax);
                // c > b && c > a;
                // aIsMax == false && bIsMax == false;

        double max = 0; // we want to assign the maximum number to variable max


        if(aIsMax){
            max = a;
            //System.out.println(a+ " is maximum number");
        }
        if(bIsMax){
            max = b;
           //System.out.println(b + " is maximum number");
        }
        if(cIsMax){
            max = c;
            //System.out.println(c + " is maximum number");
        }
        System.out.println(max + " is maximum number");




    }
}
