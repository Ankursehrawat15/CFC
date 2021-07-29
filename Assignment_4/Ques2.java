package Assignment_4;

import java.util.Scanner;

//Take ‘n’ as input and write a recursive function to return the sum of 1 to n.
// Eg: for n=5 return 15 (1+2+3+4+5
public class Ques2 {

    private static int sumTillN(int n) {

        if (n <= 1) {
            return n;
        }

        return n + sumTillN(n - 1);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int ans = sumTillN(n);
        System.out.println(ans);
    }
}
