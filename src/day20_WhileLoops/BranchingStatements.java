package day20_WhileLoops;

public class BranchingStatements {
    public static void main(String[] args) {
        char ch = 'A';

        while(ch <= 'E'){

            if (ch == 'C') {
                ch++;
                continue;
            }

            System.out.println(ch);

            ch++; // <==== bunu yazmazsan eğer infinite loop hep true olup devam eder.
        }


    }
}
