package Office_Hours.Practice_06_24_2020;

public class Switch_ShortQuiz {
    public static void main(String[] args) {

        int a = 10;

        switch (a) {
            case 10:
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday");
            case 12:
                System.out.println("Wednesday");
            default:
                System.out.println("Friday");
        }
        System.out.println("===================");

        int A = 13;

        switch (A){
            case 13:
                System.out.println("Monday");
                break;

            case 14:
                System.out.println("Tuesday");
                break;
            case 15:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Friday");
                break;
        }


    }
}
