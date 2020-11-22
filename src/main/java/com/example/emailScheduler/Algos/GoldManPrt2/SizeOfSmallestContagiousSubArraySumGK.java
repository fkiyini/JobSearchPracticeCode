package com.example.emailScheduler.Algos.GoldManPrt2;

public class SizeOfSmallestContagiousSubArraySumGK {
    public static int sizeSmallestContagious(int []arr, int k){
        int min = arr.length,i=0,j=i+1;
        while (i<arr.length){
            int sum = arr[i];
            if(sum>k) return 1;
            while (j<arr.length){
                sum+=arr[j];
                if (sum>k && (j-i+1)<min){
                    min = j-i+i;
                    System.out.println(arr[i]);
//                    break;
                }
                j++;
            }
            if(sum<k && j == arr.length)
                return -1;
            i++;
            j=i+1;
        }
        return min;
    }
    public static void main(String[] args) {
        int arr [] = {1,2};
        System.out.println(sizeSmallestContagious(arr,2));
    }
}
