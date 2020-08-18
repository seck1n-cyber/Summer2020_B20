package Office_Hours.Practice_07_20_2020;

public class Max_2DArray3 {
    public static void main(String[] args) {
        int[][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12}, {13,14,15,20,16,17000} };
        //                   0          1           2

        int max = arr2D[0][0];

        for(int i = 0; i <= arr2D.length-1; i++){ // to get each 1D array
            for(int eachNum : arr2D[i]){ // to get each element
                if(eachNum > max){
                    max = eachNum;
                }
            }
        }
        System.out.println("Maximum: "+max);


    }
}
