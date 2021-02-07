package com.geek.week1;

public class MoveZero {
    public void moveZeroes(int[] nums) {
        if(nums ==null || nums.length<=0){
            return ;
        }
        int j=0;
        for(int i =0 ;i<nums.length;i++){
            if(nums[i]!=0){
                if(i>j){
                    nums[j] = nums[i];
                    nums[i]=0;
                }
                j++;
            }
        }
    }
}
