package com.example.emailScheduler.Algos.GoldManPrt3;

public class RainWater {
    public static int isRainWater(int arr[]){
        int left_max = 0,right_max = 0,len=arr.length-1,result = 0;
        int i=0;
        while(i<len){
            if(arr[i]<arr[len]){
                if(arr[i]>left_max){
                    left_max = arr[i];
                }
                else {
                    result+= left_max - arr[i];
                }
                i++;
            }
            else {
                if (arr[len]>right_max){
                    right_max = arr[len];
                }
                else {
                    result+= right_max - arr[len];
                }
                len--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(isRainWater(arr));
    }
}
