package Assignment_2;

public class Ques9 {

    public static void main(String[] args) {

        int[] arr = { 2, 5, 11, 13, 21, 4, 10 };

        int ans = countPrimes(arr);
        System.out.println(ans);
    }

    private static int countPrimes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;

            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == true) {
                System.out.print(arr[i] + " ");
                count++;
            }

        }

        return count;
    }

}
