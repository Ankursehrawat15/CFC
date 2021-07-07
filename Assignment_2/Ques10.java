package Assignment_2;

public class Ques10 {

    public static boolean isSorted(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < max) {
                return false;
            } else {

                max = arr[i];
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 4 };
        boolean ans = isSorted(arr);
        System.out.println(ans);
    }

}
