package day57_Polymorphism.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {
    public static void main(String[] args) {
       Employee tester1 =  new Tester("Andrii",516875,"QA",120000,'M');
       Employee tester2 =  new Tester("Musa M",123456,"SDET",130000,'M');

        Developer developer1 = new Developer("Hajar", 12098, "Team lead", 120000, 'F');
        Developer developer2 = new Developer("Abdul", 123456789,"Junior Dev",110000,'F');

        Employee scrumMaster1 = new ScrumMaster("Kamil",78945,"Scrum Master",120000,'M');

        ArrayList<Employee> scrumTeam = new ArrayList<>();

        scrumTeam.addAll(Arrays.asList(tester1,tester2,developer1,developer2,scrumMaster1) );

        for(Employee each : scrumTeam){
            System.out.println(each);
        }

    }
}
