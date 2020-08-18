package day18_forLoops;

public class EmailDomain {
    public static void main(String[] args) {

        String email = "seckinfevzikara@gmail.com";

        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");

        String domain = email.substring(index1+1, index2); //"gmail

        System.out.println(domain);
    }
}
