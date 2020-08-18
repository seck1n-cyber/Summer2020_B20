package day03_sequences_Variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SalaryCalculater {
    public static void main(String[] args) {


    //totalTax =  salary * tax;
    // salaryAftertax = salary-totalTax
        double salary = 100000.0;
        double tax = 0.28;

        double totalTax = salary * tax;
        double salaryAftertax = salary-totalTax;

        System.out.println(salaryAftertax);

    }
}

