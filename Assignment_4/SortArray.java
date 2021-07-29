package Assignment_4;

import java.util.ArrayList;
import java.util.List;

public class SortArray {

    private static void sort(int[] arr, int index, List<Integer> list) {

        if (index == 0) {
            list.add(arr[index]);
            return;

        }

        sort(arr, index - 1, list);
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (arr[index] <= list.get(i)) {
                list.add(i, arr[index]);
                count++;
                break;
            }

        }

        if (count == 0) {
            list.add(arr[index]);
        }

    }

    public static List<Integer> sort(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        sort(arr, arr.length - 1, list);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 1, 6, 7, 6, 5 };

        List<Integer> list = sort(arr);

        for (int elem : list) {
            System.out.print(elem + " ");
        }

    }
}
