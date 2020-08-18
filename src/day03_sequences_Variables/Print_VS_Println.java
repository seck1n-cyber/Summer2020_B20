package day03_sequences_Variables;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Print_VS_Println {
    public static void main(String[] args){
        System.out.println("A");
        System.out.println("B");        //bu kodlar alt alta çıkıyor
        System.out.println("C");
        System.out.println("=================");
        System.out.print("A");
        System.out.print("B");        //bu kodlar yan yana yazılıyor
        System.out.print("C");

    }
}
