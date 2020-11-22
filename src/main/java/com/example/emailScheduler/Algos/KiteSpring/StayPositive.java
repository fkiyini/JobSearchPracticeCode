package com.example.emailScheduler.Algos.KiteSpring;

import java.util.List;

public class StayPositive {
   static int [] arr = new int[9];
   static  int num = 0;
    public static boolean sequence(){
        if(cumulativeBalance(arr)>0)
            return true;
        else{
            num++;
            cumulativeBalance(arr);
        }
        return false;
    }
    public static int cumulativeBalance(int arr[]){
        int bal = arr[0] + num ;
        for(int i = 1;i<arr.length;i++){
            bal = bal + arr[i];
        }
        return bal;
    }

    public static long minStart(List<Integer> arr)
    {
        int x = 0;
        boolean stop = false;
        while(!stop)
        {
            x++;
            stop = getMinBal(arr,x);
        }
        return x;
    }

    public static boolean getMinBal(List<Integer> arr, Integer start)
    {
        int runBal = start;
        for(int i = 1;i < arr.size();i++)
        {
            runBal += arr.get(i);
            if(runBal <= 0)
            {
                return false;
            }
        }
        return true;
    }

    public static long minStartPoint(int arr[] ){
        boolean stop = false;
        int x=0;
        while (!stop){
            x++;
            stop = runningBal(arr,x);
        }
        return x;
    }
    public static boolean runningBal(int arr[], int x){
        int runBal = x;
        for(int i=0;i<arr.length;i++){
            runBal+=arr[i];
            if (runBal<=0){
                return false;
            }
        }
        return true;
    }

}
