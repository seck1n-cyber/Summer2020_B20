package day52_Exceptions;

import java.time.LocalTime;

public class ThrowPractice {

    public static void main(String[] args) {

        String driverName = "chrome";

        if(driverName.equals("chrome")){
            System.out.println("set up chrome");
        }else if(driverName.equals("firefox")){
            System.out.println("set up firefox");
        }else if(driverName.equals("opera")){
            System.out.println("set up opera");
        }else{
            throw new RuntimeException("Invalid browser name");
        }

        System.out.println("============================================================");

        if(LocalTime.now().getMinute() == 45){
            throw new RuntimeException("it's break time");
            //  System.out.println("Hello");
        }else{
            System.out.println("Continue");
        }


        throw new ArithmeticException();
        //  throw new RuntimeException();



    }
}