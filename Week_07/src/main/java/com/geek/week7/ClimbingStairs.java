package com.geek.week7;

/**
 * 爬楼梯
 * https://leetcode-cn.com/problems/climbing-stairs/
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int a = 1;
        int b =1;
        while(n-- > 0){
            b +=a;
            a=b-a;
        }
        return a;
    }

    public static void main(String[] args) {
        ClimbingStairs test = new ClimbingStairs();
        System.out.println(test.climbStairs(11));
        System.out.println(test.climbStairs(9));
    }
}
