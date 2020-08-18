package day11_NestedIf_Ternary;

/*
write a program that can find the number of days in a month
(must apply nested IF)
 */
public class DaysInMonth2 {
    public static void main(String[] args) {

        int month = 2;
        boolean validNumber = month >= 1 && month <= 12;
        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;

        String result = "";

        if (validNumber) { // for 28 days or 30 days or 31 days
            if (days28) {
                result = "28 Days";
            } else if (days30) {
                result = "30 Days";
            } else {
                result = "31 Days";
            }


        } else { // invalid Month
            result = " Invalid Month";
        }
        System.out.println(result);



    }
}
