public class Ques4 {

    public static void oddJumps(int num) {
        int even = 2;
        for (int i = 1; i < num; i++) {
            System.out.print(even + " ");
            even += 4 * i;
        }
    }

    public static void main(String[] args) {
        oddJumps(10);
    }
}
