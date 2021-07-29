package Assignment_4;

public class checkPalindrome {
    public static void main(String[] args) {
        String s = "ratecar";
        boolean ans = checkPalindrome(s);
        System.out.println(ans);
    }

    private static boolean checkPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        boolean ans = checkPalindrome(s, start + 1, end - 1);

        return ans;
    }

    public static boolean checkPalindrome(String s) {

        return checkPalindrome(s, 0, s.length() - 1);

    }
}
