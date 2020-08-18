package day03_sequences_Variables;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Hello Everyone \n\tMy name is Sam");
        // \n kodu line'yi aşşağı kaydırmak için kullanılan kısayol
        // \t bir sonrakı line'yi tap yaparak başlatıyor
        System.out.println("\t\tI am in Virginia");
        System.out.println("\n\n I Love Programming");

        System.out.println("\\"); // 2 tane \\ yaparsan 1 tane \ çıkar geriye doğru sadece
        System.out.println("/"); // ama bunu yazdırırken 1 tane yazsakta yeterli
        System.out.println("\\\\"); // eger 2 tane \\ istersen 4 tane yapman gerekir


        System.out.println("\'My Name İs Sam\'"); // single code ne sike yarıyorsa


    }
}
