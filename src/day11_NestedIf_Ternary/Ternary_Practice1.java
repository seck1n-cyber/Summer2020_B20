package day11_NestedIf_Ternary;

public class Ternary_Practice1 {
    public static void main(String[] args) {
        int age = 16;
        String citizen = "USA";

        String result = "";
        if(age >= 18 && citizen == "USA"){
            result = "Can Vote";
        }else{
            result = "Can Not Vote";
        }
        System.out.println(result);

        System.out.println("=======");

        String result2 = (age >= 18 && citizen == "USA") ? "Can Vote" : "Can Not Vote";
        System.out.println(result2);

        System.out.println("========");

        int n1 = 100;
        int n2 = 200;
        String r = (n1 == n2) ? "Equal" : "Not Equal";
        // "equal" or "not equal"

        System.out.println(r);




         int num3 = 15;
         int num4 = 14;
         System.out.println((num3==num4) ? "Equal" : "Not Equal");

        System.out.println("=================");

        int num10 = 100;
        String result3 = "";

        if(num10>0){
            result3 = "Positive";
        } else if (num10 < 0) {
            result3 = "Negative";
        }else{
            result3 = "Zero";
        }
        System.out.println(result3);









    }

}
