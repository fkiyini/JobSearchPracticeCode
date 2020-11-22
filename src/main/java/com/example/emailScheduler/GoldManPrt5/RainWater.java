package com.example.emailScheduler.GoldManPrt5;

public class RainWater {
    public static int isRainWater(int[] arr) {
        int result = 0, leftMax = 0, rightMax = 0, i = 0, len = arr.length-1;
        while (i <= len) {
            if (arr[i] < arr[len]) {
                if (arr[i] > leftMax)
                    leftMax = arr[i];
                else {
                    result += leftMax - arr[i];
                    i++;
                }
            } else {
                if (arr[len] > rightMax)
                    rightMax = arr[len];
                else {
                    result += rightMax - arr[len];
                    len--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1,3, 2, 0};
        int n = arr.length;

        System.out.println("Maximum water that "
                + "can be accumulated is "
                + isRainWater(arr));
    }

}
