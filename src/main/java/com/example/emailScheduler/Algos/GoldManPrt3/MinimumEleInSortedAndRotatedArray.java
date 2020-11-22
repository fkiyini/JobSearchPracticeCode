package com.example.emailScheduler.Algos.GoldManPrt3;

public class MinimumEleInSortedAndRotatedArray {
    public static int minimumEleInSortedAndRotatedArray(int []arr) throws Exception {
        int len = arr.length-1;
        int midIndex = arr.length/2;
        if(arr.length == 1) return arr[0];
        else if(arr.length == 2) return arr[0]<arr[len]?arr[0]:arr[len];
        else if(arr.length>2){
            if(arr[0]<arr[len])
                return arr[0];
            else if(arr[0]>arr[len] && arr[len]<arr[len-1])
                return arr[len];
            else if(arr[midIndex]<arr[midIndex+1] && arr[midIndex] <arr[midIndex-1]) return arr[midIndex];

            else if(arr[midIndex]>arr[midIndex+1]){
                for(int i = midIndex+1; i<len;i++){
                    if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                        return arr[i];
                    }
                }
            }
            else if(arr[midIndex]>arr[midIndex-1]){
                for(int i = midIndex-1; i>1;i--){
                    if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                        return arr[i];
                    }
                }
            }
        }
        throw new Exception("Men you lost");
    }
    public static void main(String[] args) throws Exception {
        int [] arr = {5, 6, 1, 2, 3, 4};
        int [] arr1 = {3, 4, 4, 1, 2};
        System.out.println(minimumEleInSortedAndRotatedArray(arr1));
    }
}
