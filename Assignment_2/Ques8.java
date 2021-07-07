package Assignment_2;

import java.util.Scanner;

public class Ques8 {

    public static int countMultiples(int[] arr) {
        int count = 0;
        for (int elem : arr) {
            if (elem % 5 == 0) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(countMultiples(arr));
    }

}
