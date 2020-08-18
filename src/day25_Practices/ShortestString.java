package day25_Practices;

public class ShortestString {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet"};
        //            4         8          4        8
        int minLength = arr[0].length(); // 4

        for (int i = 0; i <= arr.length - 1; i++) { // to find out the minimum length of the string in arr
            int l = arr[i].length(); // 4 8 4 8

            if (l < minLength) {
                minLength = l;
            }
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i].length() == minLength) {
                System.out.println(arr[i]);
            }
        }


    }
}
