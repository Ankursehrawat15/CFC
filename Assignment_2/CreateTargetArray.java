package Assignment_2;

import java.util.ArrayList;
import java.util.List;

// leetcode: https://leetcode.com/problems/create-target-array-in-the-given-order/
public class CreateTargetArray {

    public int[] createTargetArray(int[] nums, int[] index) {

        int[] ans = new int[nums.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < list.size(); i++) {

            ans[i] = list.get(i);
        }

        return ans;

    }

    public static void main(String[] args) {

    }
}
