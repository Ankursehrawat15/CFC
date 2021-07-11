package Assignment_2;

public class Ques12 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 6, 7, 10 };
        sortOddEven(arr);
        print(arr);
    }

    private static void print(int[] arr) {

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    private static void sortOddEven(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }

            while (arr[right] % 2 != 0 && right > left) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        }

    }
}
