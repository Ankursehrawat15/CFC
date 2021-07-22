package Assignmnet_3;

public class Ques2 {

    private static void printRowWise(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(" " + arr[i][j] + " ");
                }
            } else {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    System.out.print(" " + arr[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
