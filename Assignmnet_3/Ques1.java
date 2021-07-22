package Assignmnet_3;

import java.util.Scanner;

public class Ques1 {

    private static void printColumnWise(int[][] arr) {

        for (int i = 0; i < arr[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(" " + arr[j][i] + " ");
                }
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.print(" " + arr[j][i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] arr = takeInput();
        printColumnWise(arr);
    }

    private static int[][] takeInput() {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int colms = scan.nextInt();

        int[][] newarr = new int[rows][colms];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colms; j++) {
                newarr[i][j] = scan.nextInt();
            }
        }

        return newarr;
    }

}
