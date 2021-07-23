package Assignment_2;

import java.util.*;

// leetcode: https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
public class specialDiscount {

    // Using Stacks TimeComplexity is O(N) and SpaceComplexity is O(N)
    public int[] finalPrices2(int[] prices) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {

                int index = stack.pop();

                prices[index] = prices[index] - prices[i];

            }

            stack.push(i);
        }

        return prices;

    }

    public int[] finalPrices(int[] prices) {

        for (int i = 0; i < prices.length; i++) {

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {

                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }

        return prices;
    }

    public static void main(String[] args) {

    }
}
