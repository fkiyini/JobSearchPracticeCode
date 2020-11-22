package com.example.emailScheduler.Algos.GoldManPrt2;

public class RainWater {
    public static int rainWater(int arr[]){
        int count = 0,i=0, left_max = 0,right_max = 0,len = arr.length-1;
        while (i<len){
            if(arr[i]<arr[len]){
                if(arr[i] > left_max)
                    left_max = arr[i];
                else
                    count+=left_max-arr[i];
                i++;
            }
            else {
                    if(arr[len]>right_max)
                        right_max = arr[len];
                    else
                        count+=right_max-arr[len];
                len--;
            }
        }
    return count;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(rainWater(arr));
    }
}
