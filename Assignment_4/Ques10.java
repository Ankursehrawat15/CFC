package Assignment_4;

public class Ques10 {

    public static int count(String s, int index) {
        if (s.length() == 2)
            return 0;
        int count = 0;
        if (s.charAt(0) != s.charAt(1)) {
            if (s.charAt(0) == s.charAt(2)) {
                count++;
            }
        }

        int smallAns = count(s.substring(index + 1), index);

        return count + smallAns;

    }

    public static void main(String[] args) {

        String s = "AXAXAX";
        System.out.println(count(s, 0));

    }
}
