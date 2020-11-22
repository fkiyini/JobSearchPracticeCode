package com.example.emailScheduler.Algos.GoldManPrt3;

public class FindTheSecondSmallest {
    public static int findTheSecondSmallest(int []arr){
        int min1 = arr[0];
        for(int i = 1;i<arr.length;i++){
            min1 = Math.min(min1,arr[i]);
        }
//        System.out.println(min1);
        int min2 = arr[0];
        for (int i = 1;i<arr.length;i++){
            if(arr[i]<min2 && arr[i]>min1)
                min2 = arr[i];
        }
        return min2;
    }
    public static void main(String[] args) {
       int [] Example = {-142, -13, -13, 10, 34, 1};
        System.out.println(findTheSecondSmallest(Example));
    }
}
