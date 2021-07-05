import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the credits for Code For Cause: ");
        int input = scan.nextInt();

        if (input >= 7500) {
            System.out.println("Tera Leader");
        } else if (input >= 6000 && input < 7500) {
            System.out.println("Gega Leader");
        } else if (input >= 4500 && input < 6000) {
            System.out.println("Mega Leader");
        } else {
            System.out.println("Rising Star");
        }
    }
}