package algo.dp;

public class Stocks {
    //You are given an array prices where prices[i] is the price of a given stock on the ith day.
    //
    //You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    //
    //Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};
        bestProfit(prices1);
        bestProfit(prices2);
    }

    private static void bestProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        for (int price : prices) {
            if (price < buy) {
                buy = price;
            }
            if (price - buy > sell) {
                sell = price - buy;
            }
        }
        System.out.println(sell);
    }
}
