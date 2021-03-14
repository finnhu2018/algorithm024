package com.geek.week6;

/**
 * 编辑距离
 * https://leetcode-cn.com/problems/edit-distance/
 */
public class EditDistance {
    public int minDistance(String word1, String word2) {
        if( word1==null|| word1.length()<1){
            return 0;
        }
        if( word2==null|| word2.length()<1){
            return 0;
        }
        int n1 = word1.length();
        int n2 = word2.length();
        int[][] temp = new int[n1+1][n2+1];
        for (int i = 0; i <= n2 ; i++) {
            temp[0][i] = temp[0][i-1]+1;
        }
        for (int i = 0; i <= n1; i++) {
            temp[i][0] = temp[i-1][0]+1;
        }
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <=n2 ; j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    temp[i][j] = temp[i-1][j-1];
                }else {
                    temp[i][j] = Math.min(Math.min(temp[i-1][j-1],temp[i][j-1]),temp[i-1][j])+1;
                }
            }
        }
        return temp[n1][n2];



    }
}
