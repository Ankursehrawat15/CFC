package Assignment_2;

// leetcode : https://leetcode.com/problems/squares-of-a-sorted-array/
public class SquareOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;
        int i = nums.length - 1;
        while (start <= end) {

            if (nums[start] * nums[start] > nums[end] * nums[end]) {
                ans[i--] = nums[start] * nums[start];
                start++;
            } else {
                ans[i--] = nums[end] * nums[end];
                end--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
