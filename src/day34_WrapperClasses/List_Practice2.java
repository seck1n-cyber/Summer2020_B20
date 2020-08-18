package day34_WrapperClasses;
import java.util.ArrayList;
public class List_Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(Integer each : list){
            if(each > max){
                max = each;
            }
        }

        for(Integer each : list){
            if(each < min){
                min = each;
            }
        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);


    }
}
