package Assignment_4;

import java.util.ArrayList;

// Take an array as input and a target value. Write a recursive function which

// returns an array having indices stored in it at which the target value is stored in
// the original array.
// Eg: {0, 4, 2, 2, 1, 2, 3, 4, 2} target = 2
// Output: {2, 3, 5, 8}

import java.util.Scanner;

public class Ques4 {

    private static void allIndex(int[] arr, int target, int index, ArrayList<Integer> list) {

        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        allIndex(arr, target, index + 1, list);
    }

    public static int[] allIndex(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        allIndex(arr, target, 0, list);

        int[] ans = new int[list.size()];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int target = scan.nextInt();

        int[] ans = allIndex(arr, target);
        for (int elem : ans) {
            System.out.print(elem + " ");
        }

    }

}
