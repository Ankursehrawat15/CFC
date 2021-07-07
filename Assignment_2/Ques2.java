package Assignment_2;

import java.util.Scanner;

public class Ques2 {

    public static int fun(int n1, int n2, char ch) {

        if (ch == '*') {
            return n1 * n2;
        } else if (ch == '/') {
            return n1 / n2;
        } else if (ch == '%') {
            return n1 % n2;
        } else if (ch == '+') {
            return n1 + n2;
        } else if (ch == '-') {
            return Math.abs(n1 - n2);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        char ch = scan.next().charAt(0);
        scan.close();

        System.out.println(fun(n1, n2, ch));

    }
}
