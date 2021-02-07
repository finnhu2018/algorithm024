package com.geek.week1;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int len =0;
        int index =1;
        while(index<nums.length){
            if(nums[len]==nums[index]){
                index++;
            }else {
                nums[++len] = nums[index];

            }
        }
        return len+1;

    }
}
