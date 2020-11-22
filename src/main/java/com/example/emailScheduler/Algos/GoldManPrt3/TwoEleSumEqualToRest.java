package com.example.emailScheduler.Algos.GoldManPrt3;

import java.util.HashSet;

public class TwoEleSumEqualToRest {
    public static boolean twoEleSumEqualToRest(int [] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        int halfSum = sum/2;
        if(sum%2 !=0 ) return false;
        else {
            for(int i=0;i<arr.length;i++){
                int val = halfSum - arr[i];
                if(hashSet.contains(val) && val == (int)hashSet.toArray()[hashSet.size()-1]){
                    System.out.println("The two numbers are:("+val +","+arr[i]+")");
                    return true;
                }
                hashSet.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {2, 11, 5, 1, 4, 7};
        System.out.println(twoEleSumEqualToRest(arr));
    }
}
