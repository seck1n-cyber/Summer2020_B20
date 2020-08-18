package day06_ComparisonOperators;
/*
package day06_ComparisonOperators;
public class SalaryCalculator {
    public static void main(String[] args) {
        int rate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate =0.22;
        int weeklyHours = 40;
        int salary = rate*weeklyHours*48;
        double totalTax = (stateTaxRate+federalTaxRate)*salary;
        double salaryAfterTax = salary - totalTax;
        System.out.println("your salary is: "+salary+" USD");
        System.out.println("your total tax is: "+totalTax+" USD");
        System.out.println("your income after tax is: "+salaryAfterTax+" USD");
    }
}
 */
public class SalaryCalculator {
    public static void main(String[] args) {
        double rate           = 50;
        double stateTaxRate   = 0.05;
        double federalTaxRate = 0.2;
        int weeklyHours = 45;

        double salary = rate * weeklyHours * 48;
        double totalTax = salary * (stateTaxRate + federalTaxRate);
        double salaryAfterTax = salary-totalTax;

        System.out.println("Salary before tax: " + salary + " USD");
        System.out.println("Total Tax: " + totalTax + " USD");
        System.out.println("Take Home Salary:"+ salaryAfterTax + " USD");


    }
}
