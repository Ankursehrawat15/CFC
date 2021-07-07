package Assignment_2;

public class Ques11 {

    public static void sort(int[] arr) {
        int count = 0;
        for (int elem : arr) {
            if (elem == 0) {
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (count > 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            count--;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1 };
        sort(arr);
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

}
