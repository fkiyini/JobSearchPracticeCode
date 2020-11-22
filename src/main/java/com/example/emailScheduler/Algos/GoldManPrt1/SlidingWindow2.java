package com.example.emailScheduler.Algos.GoldManPrt1;

import java.util.Arrays;
public class SlidingWindow2 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length + 1 - k];
        for(int i = 0;i < nums.length-k+1;i++)
        {
            int max = nums[i];
            for(int j = i+1; j < i+k;j++)
            {
                max = Math.max(nums[j],max);
            }
            result[i] = max;
        }
        return result;
    }
    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int arr[] = {1,3,-1,-3,5,3,6,7};
//        int K = 3;
        int arr1[] = {6,7,6,7};
        int K  = 4;
        System.out.println(Arrays.toString(maxSlidingWindow(arr1,K)));
    }
}
