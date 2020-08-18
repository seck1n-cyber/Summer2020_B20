package day09_ifStatement;

public class Minumum {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        boolean  aIsMin = a < b && a < c;

        boolean bIsMin = aIsMin == false && b < c ;
                        //   b < a       && b < c ;

        boolean cIsMin = !aIsMin && !bIsMin;
             // aIsMin == false &&  bIsMin == false;

        double min = 0;

        if(aIsMin){
            min = a;
        }
        if(bIsMin){
            min = b;
        }
        if(cIsMin){
            min = c;
        }
        System.out.println(min + " is minimum number");



    }
}
