package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {
        String firstName = "Buba";
        String lastName = "Kebab";
        int age = 12;
        String citizen1 = "USA";
        String citizen2 = "France";

        boolean eligiableAge = age >= 18;
                        //     12 >= 18 ====> FALSE

        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
        //     "USA" == "USA" || "france" == "france"
        //          true      ||        false
        //                   true

        boolean eligibleToVote = eligiableAge && usCitizen;
        //                        false     &&   true  ==> false
        String fullName = firstName +" "+lastName;
        System.out.println(fullName +" is eligible to vote for Trump: "+eligibleToVote);
    }
}
