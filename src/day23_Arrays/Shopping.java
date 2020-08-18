package day23_Arrays;

public class Shopping {
    public static void main(String[] args) {
        String[] shoopingList = new String[7];

        shoopingList[0] = "Toilet Paper";
        shoopingList[1] = "Hand Sanitizer";
        shoopingList[4] = "Eggs";
        shoopingList[6] = "Corona Beer";
        shoopingList[2] = "Bread";
        shoopingList[3] = "Milk";
        shoopingList[5] = "Water";

        for(int i = 0; i <= shoopingList.length -1; i++){
            System.out.println(shoopingList[i] );
        }

    }
}
