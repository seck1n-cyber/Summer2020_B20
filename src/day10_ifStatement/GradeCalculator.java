package day10_ifStatement;

public class GradeCalculator {
    public static void main(String[] args) {

        int score = 95;
        String grade = "";

        if(score >= 90 && score <= 100){
            grade = "A";
        }else if(score >= 80 && score <= 89){
            grade = "B";
        }else if(score >= 70 && score <= 79){
            grade = "C";
        }else if(score >= 60 && score <= 69){
            grade = "D";
        }else if(score >= 0 && score <= 59) {
            grade = "F";
        }else{
            grade = "Invalid Score";
        }
            System.out.println(grade);




    }
}
