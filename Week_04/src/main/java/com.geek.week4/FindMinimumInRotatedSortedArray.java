package com.geek.week4;

/**
 * https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {

        // Arrays.sort(nums);
        // return nums[0];

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];

    }
}
