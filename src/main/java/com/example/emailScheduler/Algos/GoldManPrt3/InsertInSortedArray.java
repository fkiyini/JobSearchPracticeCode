package com.example.emailScheduler.Algos.GoldManPrt3;

import java.util.Arrays;

public class InsertInSortedArray {
    public static int [] insertInSortedArray(int [] arr, int a){
        int len = arr.length;
        int k=0,e=0;
        int [] newArray = new int[len+1];
        if(arr[0]>=a){
            int j=1;
            newArray[0] = a;
            for(int i=0;i<len;i++){
                newArray[j] = arr[i];
                j++;
            }
        }
        else if(arr[len-1]<=a){
            int j=0;
            for(int i=0;i<len;i++){
                newArray[j] = arr[i];
                j++;
            }
            newArray[len] = a;
        }
        else {
            while (k<len){
                if(arr[k]<a){
                    newArray[e] = arr[k];
                    e++;k++;
                    System.out.println(e);
                }
                else {
                    newArray[e] = a;
                    e++;
                    while (e < len+1) {
                        newArray[e] = arr[k];
                        e++;k++;
                    }
                }
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        int [] Example = { 12, 16, 20, 40, 50, 70 };
        System.out.println(Arrays.toString(insertInSortedArray(Example,58)));
    }
}
