package Assignment_2;

import javax.print.event.PrintEvent;

public class Ques15 {

    public static void printTriplets(int[] arr, int target) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {

                for (int z = j + 1; z < arr.length; z++) {

                    if (arr[i] + arr[j] + arr[z] == target) {
                        System.out.println(arr[i] + "," + arr[j] + "," + arr[z]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 9, 7, 5, -1, 6 };
        printTriplets(arr, 9);
    }

}
