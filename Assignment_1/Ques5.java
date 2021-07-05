import java.util.Scanner;

public class Ques5 {

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {

            count++;
            n = n / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(countDigits(num));
    }
}
