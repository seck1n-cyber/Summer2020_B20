package day05_ArithmeticOperators;

public class EmployeeInfo2 {
    public static void main(String[] args) {
        String firstName   = "Aaron";
        String lastName    = "Jones";
        int    age         = 45;
        String companyName = "CapitalOne";
        char gender        = 'M';
        String jobTitle    = "QA";
        boolean isFullTime = true;
        boolean isMarried  = false;
        double salary      = 120_000.50;
        String fullName    = firstName+" " + lastName; //"Aaron Jones"


        System.out.println("Employee' Full name is: "+ firstName+" "+lastName);
        System.out.println(firstName+" "+ lastName+ "' gender is: " +gender );
        System.out.println(firstName+" "+ lastName+ "' age is: " + age + " years old" );
        System.out.println(firstName+" "+ lastName+ " works at: " +companyName);
        System.out.println(firstName+" "+ lastName+ "' job Title is: " +jobTitle);
        System.out.println(firstName+" "+ lastName+ "' salary is: $" +salary);
        System.out.println(firstName+" "+ lastName+ " is full time employee: " +isFullTime);
        System.out.println(firstName+" "+ lastName+ " is married: " +isMarried);



    }

}
