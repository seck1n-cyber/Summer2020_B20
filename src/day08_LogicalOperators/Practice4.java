package day08_LogicalOperators;
/*
Create a double ariable with the value 20
create a second variable of type double with vthe value 80
add both numbers up and multiply by 25
use the remainder operator to figure out the remainder from the sum
print remaining total (#4) is equal to 20 or less: true /false

 */
public class Practice4 {
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 80;
        double result = (num1+num2)*25; //2500
        double remainder = result % 40;

        boolean r = remainder <= 20;

        System.out.println(r);



    }
}
