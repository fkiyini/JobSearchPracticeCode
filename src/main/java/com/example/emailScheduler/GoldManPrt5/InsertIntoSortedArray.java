package com.example.emailScheduler.GoldManPrt5;

import java.util.Arrays;

public class InsertIntoSortedArray {
    public static int [] isInsertIntoSortedArray(int arr [], int num){
        int newArr [] = new int [arr.length+1];
        int i = 0,k=1,e=0;
        if (arr[0]>=num){
            newArr[0] = num;
            for (int j=0;j<arr.length;j++){
                newArr[k] = arr[j];
                k++;
            }
        }
        else if (arr[arr.length-1]<=num) {
            for (int j=0;j<arr.length;j++){
                newArr[j] = arr[j];
            }
            newArr[arr.length] = num;
        }
        else {
            while(i<arr.length) {
                if (arr[i] < num) {
                    newArr[e] = arr[i];
                    e++;i++;
                } else {
                    newArr[e] = num;
                    e++;
                    while (i < arr.length) {
                        newArr[e] = arr[i];
                        i++;
                    }
                }
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int [] Example = { 12, 16, 20, 40, 50, 70 };
        System.out.println(Arrays.toString(isInsertIntoSortedArray(Example,90)));
    }
}
