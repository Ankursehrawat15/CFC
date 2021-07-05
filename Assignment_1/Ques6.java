import java.util.Scanner;

public class Ques6 {

    public static int reverse(int n) {
        int ans = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            ans = 10 * ans + lastDigit;
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
