package Assignment_2;

import java.lang.module.FindException;
import java.util.Scanner;

public class fibonnaci {

    private static int findFib(int n) {
        if (n <= 1)
            return n;

        return findFib(n - 1) + findFib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(findFib(num));
    }
}
