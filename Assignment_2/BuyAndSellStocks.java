package Assignment_2;

public class BuyAndSellStocks {
    // Time Complexity is O(N) and Space Complexity is O(N)
    public int maxProfit(int[] prices) {

        int[] maxPrice = new int[prices.length];
        int max = Integer.MIN_VALUE;
        for (int i = prices.length - 1; i >= 0; i--) {

            max = Math.max(max, prices[i]);
            maxPrice[i] = max;
        }

        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            int profit = maxPrice[i] - prices[i];
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;

    }

    // Time and Space is O(N) and O|(1)
    public int maxProfit2(int[] prices) {

        int minSoFar = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            minSoFar = Math.min(prices[i], minSoFar);
            int profit = prices[i] - minSoFar;

            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;

    }

    public static void main(String[] args) {

    }
}
