package Assignment_4;

import java.util.Collections;

public class BubbleSort {

    private static void sort(int[] arr, int si, int li) {

        if (li == 0) {
            return;
        }

        if (si == li) {
            sort(arr, 0, li - 1);
            return;
        }

        if (arr[si] > arr[si + 1]) {
            int temp = arr[si];
            arr[si] = arr[si + 1];
            arr[si + 1] = temp;
        }

        sort(arr, si + 1, li);

    }

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        sort(arr);
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

}
