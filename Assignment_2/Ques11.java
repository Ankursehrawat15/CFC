package Assignment_2;

public class Ques11 {

    public static void sort0and1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (arr[left] == 0 && left < right) {
                left++;
            }
            while (arr[right] == 1 && right > left) {
                right--;
            }

            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1 };
        sort0and1(arr);
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

}
