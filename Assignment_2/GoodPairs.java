package Assignment_2;

import java.util.HashMap;

public class GoodPairs {

    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pair = 0;

        for (int num : nums) {

            if (map.containsKey(num)) {
                int k = map.get(num);
                pair += k;

                map.put(num, k + 1);

            } else {

                map.put(num, 1);
            }

        }

        return pair;
    }

    public static void main(String[] args) {

    }

}
