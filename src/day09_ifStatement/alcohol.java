package day09_ifStatement;
/*
write a java program that can identify if a person is eligible to buy alcohol

 */
public class alcohol {
    public static void main(String[] args) {
        boolean hasID = true;
        int     age   = 26;

        boolean eligible = hasID && age >= 21;
        String result = "";
        //                 true  && false ===> false
        if(eligible == true){
            //System.out.println("Eligible to buy alcohol");
            result = "Eligible to buy alcohol";
        }
        if(eligible == false){
            //System.out.println("Fuck off, you cant buy");
            result = "You are not OLD enough evlat";
        }
        System.out.println(result);

            // iki yoluda kullanabilirsin

    }
}
