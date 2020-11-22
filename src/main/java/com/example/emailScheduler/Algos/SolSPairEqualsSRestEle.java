package com.example.emailScheduler.Algos;

import java.util.Arrays;

public class SolSPairEqualsSRestEle {

    public static int solSPairEqualsSRestEle(int [] arr){
        int sum = 0;
        Arrays.sort(arr);
        for(int i = 0;i<arr.length-1;i++){
            sum = sum+arr[i];
        }
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length-2;i>=0;i--){
            System.out.println(arr[i]+ arr[arr.length-1]);
            if(arr[i]+ arr[arr.length-1] == sum-arr[i] ) return 1;
            else continue;
        }
        return 0;
    }
    public static void main(String[] args) {
        int [] arr = {2, 11, 5, 1, 4, 7};
        System.out.println(solSPairEqualsSRestEle(arr));
    }
}
