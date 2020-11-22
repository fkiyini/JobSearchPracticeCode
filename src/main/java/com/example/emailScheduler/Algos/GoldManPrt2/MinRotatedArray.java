package com.example.emailScheduler.Algos.GoldManPrt2;

public class MinRotatedArray {
    public static int minRotatedArray(int [] arr) throws Exception {
        int min;
       if(arr.length == 0) throw new Exception("The Array is empty:)");
       else if(arr.length == 1) return arr[0];
       else if(arr.length == 2){
           if(arr[0]>arr[1]) return arr[1];
           else return arr[0];
       }
       else {
           int len = arr.length;
           min = arr[len/2];
           if(arr[0]<arr[1] && arr[0]<arr[len-1]) return arr[0];
           else if(arr[(len/2)+1]>min && min<arr[(len/2)-1]) return min;
           else if(min>arr[(len/2)+1]){
               for(int i = (len/2)+1; i<len-1;i++){
                   if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                       return arr[i];
                   }
               }
           }
           else if(min>arr[(len/2)-1]){
               for(int i = (len/2)-1; i>1;i--){
                   if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                       return arr[i];
                   }
               }
           }
       }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        int [] arr = {5, 6, 1, 2, 3, 4};
        int [] arr1 = {1, 2, 3, 4};
        System.out.println(minRotatedArray(arr1));
    }
}
