package com.example.emailScheduler.GoldManPrt5;

public class SmallestContagiousArraySumGtrK {
    public static int smallestContagiousArraySumGtrK(int [] arr , int k){
        int min = arr.length,i=0,j=i+1;
        int sum = 0;
        while (i<arr.length){
            sum = arr[i];
            if (sum>k) return 1;
            while (j<arr.length){
                sum+=arr[j];
                if (sum>k && j-i+1 < min){
                    min = j-i+1;
                }
                i++;j++;
            }
            i++;
            j=i+1;
        }
        if (sum<=k) return -1;
        return min;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,9};
        System.out.println(smallestContagiousArraySumGtrK(arr,3));
    }
}
