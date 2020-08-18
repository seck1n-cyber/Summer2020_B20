package day33_LocalDateTime;

import java.time.LocalDate;

public class Practice1 {
    public static void main(String[] args) {
        String[] students = {"Kalbinur", "Virginia", "Odina", "Ernis", "Isa"};
        LocalDate[] birthDays = {LocalDate.of(1982,12,26),
                                LocalDate.of(1993,11,25),
                                LocalDate.of(1980,05,23),
                                LocalDate.of(1990,2,21),
                                LocalDate.of(1982,11,28) };

        for(int i = 0; i <= students.length-1; i++){
            System.out.println(students[i]+ " : "+ birthDays[i] );
        }
        System.out.println("============");
        for(LocalDate each : birthDays){
            if(!each.isLeapYear()){
                continue;
            }
            System.out.println(each);
        }




    }
}
