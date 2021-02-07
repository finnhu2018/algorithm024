package com.geek.week1;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        reverse(nums, 0, length-1);//反转所有
        reverse(nums, 0, k-1);//接着前面
        reverse(nums, k, length - 1);//最后后面
    }

    //把数组中从[start，end]之间的元素两两交换,也就是反转
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
