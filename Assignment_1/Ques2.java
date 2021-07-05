import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();
        System.out.println("Enter the rate: ");
        int rate = sc.nextInt();
        System.out.println("Enter the time: ");
        int time = sc.nextInt();

        double simpleIntreset = (amount * time * rate) / 100;
        System.out.println("Simple Intrest is: " + simpleIntreset);
    }
}
