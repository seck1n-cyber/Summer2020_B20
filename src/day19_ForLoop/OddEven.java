package day19_ForLoop;

public class OddEven {
    public static void main(String[] args) {
        // 1 3 5 7 9 11 ..... 99

        for (int i = 1; i <= 99; i += 2) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for (int i = 0; i <= 100; i++) {

            if (i % 2 != 0) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println();

        for (int i = 0; i <= 100; i += 2) {
            if (i % 5 == 0 & i % 3 == 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " ");
                }
            }
        }

        System.out.println();





    }
}
