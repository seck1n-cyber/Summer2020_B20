package day10_ifStatement;
/*
Multi-Branch if : if there are more than 2 options or possiblities

if(Condition1){
       A
  }else if(Condition2){
            B
  }else if(Condition3){
            C
  }else{
 */
public class MultiBranch {
    public static void main(String[] args) {

        int number = 31;

        if (number > 0) {
            System.out.println(number +" is positive");
        } else if (number < 0) {
            System.out.println(number +" is negative");
        } else {        // } else if(number == 0){
            System.out.println(number + " is zero");
        }


    }
}
