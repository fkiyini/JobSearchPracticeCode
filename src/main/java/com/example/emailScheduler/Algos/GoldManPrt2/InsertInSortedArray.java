package com.example.emailScheduler.Algos.GoldManPrt2;

import java.util.Arrays;

public class InsertInSortedArray {
    public static int [] insertInsortedArray(int arr [], int k){
        int [] newArr = new int[arr.length+1];
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]<k)
                newArr[i] = arr[i];
            else if(arr[i]>k && i<arr.length){
                newArr[i] = k;
                int e = i+1;
                while (i<arr.length){
                    newArr[e] = arr[i];
                    i++;e++;
                }
            }
        }
        if(newArr[arr.length] == 0)
            newArr[arr.length] = k;
        return newArr;
    }

    public static void main(String[] args) {
        int arr1[] = { 12, 16, 20, 40, 50, 70 } ;

        System.out.println(Arrays.toString(insertInsortedArray(arr1,10)));
    }
}
