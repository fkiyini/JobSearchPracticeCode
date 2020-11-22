package com.example.emailScheduler.Algos.GoldManPrt1;

import java.util.Arrays;

public class SlidingWindow {

    public static int [] slidingWindow(int []arr, int k){
        int len = arr.length;
        int [] arr1 = new int[len];
        String str = "";
        int limit = k-1,w=0;
        for (int i = 0;i<len;i++){
            while (len>i && len>limit ){
//                str = str + maxValue(arr,i,limit,k);
                arr1[w] = maxValue(arr,i,limit,k);
                w++;
                limit+=2;
            }
            i++;
        }
        return arr1;
    }
    public static int maxValue(int [] arr,int currentPos,int limit,int k){
        int max = arr[currentPos];
        while (k>1){
            if(max < arr[limit]){
                max = arr[limit];
            }
            k--;
            limit--;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int arrr[] = {1,3,-1,-3,5,3,6,7};
        int K = 3;
        System.out.println(Arrays.toString(slidingWindow(arrr,K)));
    }
}
