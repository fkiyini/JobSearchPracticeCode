package com.example.emailScheduler.Algos;

public class SamKiteStringMaxSpan {

    public static int maxSpan(int [] arr){
        int last=1,first=1,i=1,j=arr.length-2;
        int firstEle = arr[0],lastEle = arr[arr.length-1];
       while (i<arr.length-1){
           if(firstEle == arr[i]){
               first++;
           }
           if(lastEle == arr[i]){
               last++;
           }
           i++;
       }
        return first+last;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,1,1,3,4};
        System.out.println(maxSpan(arr));
    }
}
