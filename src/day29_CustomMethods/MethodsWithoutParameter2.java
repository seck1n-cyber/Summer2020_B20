package day29_CustomMethods;

public class MethodsWithoutParameter2 {
    /*
    Acces-Modifier Specifiers return-type name(){
    }
     */
    public static void main(String[] args) {

        printHello5X();
        System.out.println("Cybertek");
        printHello5X();
        System.out.println("Seckin");
        printHello5X();
    }

    public static void printHello5X(){
        for (int i = 10; i >= 6; i--){
            System.out.println("Hello");
        }



    }


}
