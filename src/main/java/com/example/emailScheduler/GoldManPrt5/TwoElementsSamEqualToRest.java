package com.example.emailScheduler.GoldManPrt5;

import com.example.emailScheduler.Algos.Excep;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public class TwoElementsSamEqualToRest {
    public static boolean  isTwoElementsSamEqualToRest(int [] arr) throws Exception {
        int sum = 0;
        Set set = new HashSet();
        for (int i:arr){
            sum+=i;
        }
        if (sum%2 == 1) throw new Exception("Men....");
        for(int i=0;i<arr.length;i++){
            int val = sum/2 - arr[i];
            if (set.contains(val) && val == (int)set.toArray()[set.size()-1] ){
                System.out.println("["+val +","+arr[i]+"]");
                return true;
            }
            set.add(arr[i]);
            System.out.println(set);
        }
        return false;
    }
    public static int pascalsTriangle(int row, int col){
        if(col == 0 || col == row) return 1;
        return pascalsTriangle(row-1 ,col-1) + pascalsTriangle(row-1,col);
    }
    public static void main(String[] args) throws Exception{
        int arr[] = {2, 11, 5, 1, 4, 7};
        isTwoElementsSamEqualToRest(arr);
        System.out.println(pascalsTriangle(5,2));
    }
}
