package Assignment_2;

import java.util.Scanner;

public class Ques4 {

    public static int reverse(int n) {
        int ans = 0;
        while (n != 0) {
            int digit = n % 10;
            ans = 10 * ans + digit;

            n = n / 10;
        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(reverse(num));
    }
}
