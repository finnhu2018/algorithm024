package com.geek.week6;

import java.util.Stack;

/**
 * 最长有效括号
 * https://leetcode-cn.com/problems/longest-valid-parentheses/
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        //栈
//        int res =0;
//        if( s == null|| s.length() ==0){
//            return res;
//        }
//        int left = -1;
//        Stack<Integer> stack = new Stack<Integer>();
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) =='('){
//                stack.push(i);
//            }else {
//                if(stack.isEmpty()){
//                    left = i;
//                }else {
//                    stack.pop();
//                    if(stack.isEmpty()){
//                        res = Math.max(res,i-left);
//                    }else {
//                        res = Math.max(res,i-stack.peek());
//                    }
//                }
//            }
//        }
//        return res;

        //DP
        if (s == null || s.length() == 0) return 0;
        int[] dp = new int[s.length()];
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i - 2 >= 0 ? dp[i - 2] + 2 : 2);
                } else if (s.charAt(i - 1) == ')' && i - dp[i - 1] - 1 >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + 2 + (i - dp[i - 1] - 2 >= 0 ? dp[i - dp[i - 1] - 2] : 0);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
