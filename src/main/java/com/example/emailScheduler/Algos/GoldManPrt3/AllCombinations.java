package com.example.emailScheduler.Algos.GoldManPrt3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllCombinations {
    static int[] dp;

    public static int combinationSum4(int[] nums, int target) {
        dp = new int[target + 1];
        Arrays.fill(dp, -1);
//            System.out.println(Arrays.toString(dp));
        return getCombination(nums, target, 0);
    }

    private static int getCombination(int[] nums, int target, int sum) {
        List list = new ArrayList();
        if (dp[sum] != -1) return dp[sum];
        if (sum > target) return 0;
        if (sum == target) return 1;
        int count = 0;
        for (int num : nums) {
            if (sum + num <= target)
//                    list.add(count);
                count += getCombination(nums, target, sum + num);
//                System.out.println(count);
            System.out.println(sum);
            list.add(count);

        }
        System.out.println(list);
        dp[sum] = count;
//            System.out.println(Arrays.toString(dp));
        System.out.println(dp[sum]);
        return dp[sum];
    }


//          private static void print(int[] values, int n) {
//            for (int i = 0; i 0) {
//                values[index] = x;
//                decompose(0, values, index + 1);
//            }
//        }
//
//        public static void decompose(int x) {
//            int[] values = new int[x];
//            decompose(x, values, 0);
//        }
    static void findCombinationsUtil(int arr[], int index, int num, int reducedNum) {
        // Base condition
        if (reducedNum < 0)
            return;
        // If combination is   // found, print it
        if (reducedNum == 0) {
            for (int i = 0; i < index; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            return;
        }
        // Find the previous number   // stored in arr[]. It helps // in maintaining increasing// order
        int prev = (index == 0) ?1 : arr[index - 1];
        // note loop starts from    // previous number i.e. at   // array location index - 1
        for (int k = prev; k <= num; k++) {
            // next element of // array is k
            arr[index] = k;
            // call recursively with    // reduced number
            findCombinationsUtil(arr, index + 1, num, reducedNum - k);
        }
    }
    /* Function to find out all  combinations of positive     numbers that add upto given      number. It uses findCombinationsUtil() */
    static void findCombinations(int n) {
        // array to store the combinations  // It can contain max n elements
        int arr[] = new int[n];
        // find all combinations
        findCombinationsUtil(arr, 0, n, n);
    }

    public static void comUtil(int []arr, int index, int num, int reducedNum){
        if(reducedNum<0){
            return;
        }
        if (reducedNum == 0){
            for(int i=0;i<index;i++){
                System.out.print(arr[i] + " ");
                System.out.println();
            }
        }
        int prev = (index==0)?1: arr[index-1];
        for(int i=prev;i<=num;i++){
            arr[index] = i;
            comUtil(arr,index+1,num,reducedNum-i);
        }
    }
    public static void com(int n){
        int [] arr = new int [n];
        comUtil(arr,0,n,n);
    }
    public static void main(String[] args) {
        int[] nums = {1, 2};
        int target = 3;
        System.out.println(combinationSum4(nums, target));
        int x = 5;
//            decompose(x);
        findCombinations(x);

    }
}
