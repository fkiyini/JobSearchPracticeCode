package com.example.emailScheduler.Algos.GoldManPrt2;
import java.util.*;
public class BalancedArrayTwoItems {
    public static boolean aBalancedArrayTwoItems(int arr []){
        int sum =0;
        Set hashSet = new HashSet();
        for (int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
//        List list = Arrays.asList(arr);
        if(sum%2 !=0) return false;
        else {
            int midSum = sum/2;
            for(int i = 0;i<arr.length;i++){
                if(hashSet.contains(midSum-arr[i])){
                    return true;
                }
                hashSet.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2, 11, 5, 1, 4, 7};
        System.out.println(aBalancedArrayTwoItems(arr));
    }
}
