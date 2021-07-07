package Assignment_2;

import java.util.Scanner;

public class Ques3 {

    public static void check(char ch) {

        if (ch >= 65 && ch <= 90) {
            System.out.println("UpperCase");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("LowerCase");
        } else {
            System.out.println("Invalid input");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);

        check(ch);

    }
}
