package Assignment_2;

import java.util.Arrays;

public class Ques14 {

    public static void printPair(int[] arr, int target) {

        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                System.out.println(arr[start] + "," + arr[end]);
                start++;
            } else if (sum > target) {
                end--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 11, 2, 9, 7, 4, 5, -1, 13, 6 };
        printPair(arr, 8);

    }

}
