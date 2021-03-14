package com.geek.week6;

/**
 * 最大正方形
 * https://leetcode-cn.com/problems/maximal-square/solution/li-jie-san-zhe-qu-zui-xiao-1-by-lzhlyle/
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if(matrix ==null || matrix.length==0|| matrix[0].length==0){
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int res = 0;
        int[][] temp = new int[m+1][n+1];
        for (int i =1 ; i<=m;i++){
            for (int j =1 ; j<= n;j++){
                if(matrix[i-1][j-1]=='1'){
                    temp[i][j] = Math.min(Math.min(temp[i][j-1],temp[i-1][j-1]),temp[i-1][j])+1;
                    res = Math.max(temp[i][j],res);
                }
            }
        }
        return res*res;
    }
}
