package com.geek.week4;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/
 */
public class BestTimeBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int res =0;
        int temp=prices[0];
        for(int i =1; i<prices.length;i++){
            if(prices[i]>temp){
                res += (prices[i]-temp);
            }
            temp = prices[i];
        }
        return res;
    }
}
