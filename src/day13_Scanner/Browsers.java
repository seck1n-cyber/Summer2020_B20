package day13_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "chrome";
        // boolean, long , double , float

        switch(browserName){
            case "chrome":
                System.out.println("Opening Chrome Browser");
                break;

            case "firefox":
                System.out.println("Opening Firefox Browser");
                break;

            case "Opera":
                System.out.println("Opening Opera Browser");
                break;

            case "Safari":
                System.out.println("Opening Safari Browser");
                break;

            case "Edge":
                System.out.println("Opening Edge Browser");
                break;

            default:
                System.out.println("Invalid Browser Name");
        }


    }
}
