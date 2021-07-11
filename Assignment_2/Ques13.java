package Assignment_2;

public class Ques13 {

    private static void print(int[] arr) {
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        reverse(arr);
        print(arr);
    }

}
