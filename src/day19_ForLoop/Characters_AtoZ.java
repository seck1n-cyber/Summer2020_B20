package day19_ForLoop;

public class Characters_AtoZ {
    public static void main(String[] args) {
        for(char ch = 'A'; ch < 'Z'+1; ch++){
            System.out.print(ch+" ");
        }

        System.out.println();

        for(int i = 65; i <= 90; i++){
            System.out.print((char)i+" ");
        }

        System.out.println();

        System.out.println("========");

        for(char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch+" ");
        }

        System.out.println();

        for(int i = 90; i >= 65; i--){
            System.out.print((char)i+" ");
        }

        System.out.println();
        System.out.println("=======");

        /*
        for(int i = 0; i < 65000; i++){
            System.out.print((char)i+" ");
        }
                      TUM HARFLERİ RAKAMLARI PRİNTLEMENİ SAĞLAYAN KOD
         */




    }
}
