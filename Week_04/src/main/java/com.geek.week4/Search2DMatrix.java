package com.geek.week4;

/**
 * https://leetcode-cn.com/problems/search-a-2d-matrix/
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix ==null || matrix.length<=0){
            return false ;
        }
        for(int[] arr : matrix){
            if(arr[arr.length-1] < target){
                continue;
            } else {
                for(int i =0 ;i<arr.length;i++){
                    if(arr[i]== target){
                        return true;
                    }
                }
            }
        }
        return false;

    }
}
