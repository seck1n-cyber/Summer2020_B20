package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        String firstName ="Seckin Fevzi";
        String lastName = "Kara";
        int age = 27;

        String citizenShip = "Turkey";

        boolean eligibleToVote = age >= 18 && citizenShip == "USA";
                            //   age > 17;
        //                       19 >= 18   && "China"   == "USA"
        //                         true    &&  false ==>  false

        String fullName = firstName+ " " +lastName;

        System.out.println(fullName+" is eligible to vote: " +eligibleToVote); // Seckin Fevzi Kara is eligible to vote: true






    }
}
