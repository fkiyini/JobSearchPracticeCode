package com.example.emailScheduler.GoldManPrt6;

public class FindSecondSmallestAndSecondBiggest {
    public static int isSecondSmallest(int [] array) throws Exception {
        int len  = array.length;
        int first, second;
        first = second = Integer.MAX_VALUE;
        for (int i=0;i<len;i++){
            if (array[i]<first){
                second = first;
                first = array[i];
            }
            else if (array[i]<second && array[i]!=first){
                second = array[i];
            }
        }
        if (second == Integer.MAX_VALUE) throw new Exception("hi bro");
        return second;
    }

}
