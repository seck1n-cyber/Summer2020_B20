package day06_ComparisonOperators;

public class implicit_explicit {
    public static void main(String[] args) {


        //implicit casting: casting smallar primitive type to larger primitive type
        short s1 = 100;
        long l1 = s1; // implicit casting : automatically done

        long l2 = (long)s1; // implicit casting manuel ama önerilmez

        int I1 = 300;

        double D1 = I1; // 300.0

        System.out.println(D1);

        double D2 = (double) I1; // rengi soluk olan double manuel gereksiz
        System.out.println("==================");

       //explicit casting : casting larger primitives to smaller primitive types
        // this one must be done manually

        double num1 = 100.5;
        int num2 = (int)num1; // int'e dönüştürünce düz 100 oluyor

        System.out.println(num2);

        System.out.println("================");

        double d1 = 400.55555;
        int i1 = (int)d1;

        System.out.println(i1); // 400

        long L1 = 4400;

        short sh1 = (short)L1;

        System.out.println(sh1);

















    }
}
