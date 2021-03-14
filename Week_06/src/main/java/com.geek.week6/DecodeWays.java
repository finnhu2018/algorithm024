package com.geek.week6;

/**
 * 解码方法
 * https://leetcode-cn.com/problems/decode-ways/
 */
public class DecodeWays {
    public int numDecodings(String s) {
//        if(s== null || s.length()==0){
//            return 0;
//        }
//        int n = s.length();
//        int[] dp = new int[n+1];
//        dp[0] = 1;
//        dp[1] = s.charAt(0) != '0'?1:0;
//        for (int i = 2; i < =n ; i++) {
//            int first = Integer.parseInt(s.substring(i-1,i));
//            int second = Integer.parseInt(s.substring(i-2,i));
//            if(first>=1 && first <=9) {
//                dp[i] += dp[i-1];
//            }
//            if(second>=10 && second<=26){
//                dp[i] += dp[i-2];
//            }
//        }
//        return dp[n];

         if(s ==null || s.length()==0){
             return 0;
         }
         int n = s.length();
         int[] temp = new int[n+1];
         temp[n]=1;
         temp[n-1] = s.charAt(n-1) != '0'?1:0;
         for(int i =n-2;i>=0;i--){
             if(s.charAt(i)=='0'){
                 continue;
             }else {
                 temp[i] = (Integer.parseInt(s.substring(i,i+2))<=26) ? temp[i+1]+temp[i+2] : temp[i+1];
             }
         }
         return temp[0];
    }
}
