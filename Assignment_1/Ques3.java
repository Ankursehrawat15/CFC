import java.util.Scanner;

public class Ques3 {

    // Another Way
    public static int gcd2(int num1, int num2) {
        while (num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        return num2;
    }

    public static int gcd(int num1, int num2) {
        int max = Math.max(num1, num2);
        int ans = 0;
        for (int i = 2; i <= max; i++) {
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
        System.out.println(gcd2(num1, num2));
    }
}
