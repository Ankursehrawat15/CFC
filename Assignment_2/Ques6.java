package Assignment_2;

import java.util.Scanner;

public class Ques6 {

    public static int gcd(int num1, int num2) {

        int max = Math.max(num1, num2);
        int ans = 0;

        for (int i = 1; i <= max; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int ans = gcd(num1, num2);
        System.out.println(ans);
    }
}
