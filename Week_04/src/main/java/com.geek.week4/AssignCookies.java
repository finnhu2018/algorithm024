package com.geek.week4;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/assign-cookies/description/
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
         Arrays.sort(g);
         Arrays.sort(s);
         int res =0;
         int i=0;
         while (res < g.length && i < s.length) {
             if (g[res] <= s[i]) {
                 res++;
             }
             i++;
         }
         return res;
    }
}
