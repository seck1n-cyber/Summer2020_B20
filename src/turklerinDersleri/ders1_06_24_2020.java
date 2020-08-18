package turklerinDersleri;

public class ders1_06_24_2020 {
    public static void main(String[] args) {
                byte a, b;
                a = 127;//127
                b = -104;//-128
//      a = 2, b= 3;
                short c = 120, d = 240;
                int e = 10_000;
                int f = e + c;
                short t = (byte) f;
                double numDouble = 34.0;
                float numFloat = 34.0f;
                int newNumber =(int) (numDouble - numFloat + f);
                System.out.println(c);
                System.out.println(a + b);
                System.out.println(d - c * a);
                long x = f + c;
                short y = (short) (f + c);
                //System.out.println(f + c);
                //System.out.println(x);
                //System.out.println(x + y);
                long numberL = 1_000_000_0000L;
                int numberInt = (int) numberL;
                char g = 'a';// 97
                char h = 67;// "C"
                System.out.println(h);
                System.out.println("h" + g);
                System.out.println(h + g);
                System.out.println(g + h);
                boolean result1 = true, result2 = !false;
                boolean total = result1 == result2;
                System.out.println(total);
                int num1, num2, num3;
                num1 = 10;
//        System.out.println(num1++);
//        System.out.println(num1);
                num2 = num1++;
                System.out.println(num2);
                num3 = --num2;
                System.out.println(num2);
                System.out.println(num1 + "\n" + num2 + "\n" + num3 + "\n" + num1);
                String answer = "";
//        if(total == true){
//            answer = "Get true answer";
//        }else{
//            answer = "Get wrong answer";
//        }
                System.out.println(answer);
                a = 1;
                b = 2;
                if (a == b + 1){
                    a--;
                    if (b < 0)
                        System.out.println(a + b);
                }else if (a == b - 1){
                    b--;
                    System.out.println(a + b);
                }
                String coin1, coin2;
                coin1 = "head";
                coin2 = "tails";
                String trial = coin1 == "head" ? "win" : coin2 == "tails" ? "win" : "fail";
                System.out.println(trial);
            }
        }