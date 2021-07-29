package Assignment_4;

import java.util.Scanner;

// Given an array and a target value, write a recursive function that will return the
// last index of the occurrence of that target value. If not present in the array return
// -1.
// Eg: {3 2 1 8 6 1 3} target = 1
// Output: 5

public class Ques3 {

    private static int lastOcurrence(int[] arr, int target, int index) {
        if (index < 0) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        int last = lastOcurrence(arr, target, index - 1);

        return last;
    }

    private static int lastOcurrence(int[] arr, int target) {

        int ans = lastOcurrence(arr, target, arr.length - 1);
        return ans;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = { 3, 2, 1, 8, 6, 1, 3 };
        int target = scan.nextInt();
        int ans = lastOcurrence(arr, target);
        System.out.println(ans);
    }
}
