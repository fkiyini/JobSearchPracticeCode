package com.example.emailScheduler.KiteStringPart1;

import java.util.ArrayDeque;

public class MaxInEveryContiguousArray {
    ArrayDeque<Integer> deque = new ArrayDeque<>();
    int [] nums;
    public void clean_deque(int i,int k){
        if(!deque.isEmpty() && deque.getFirst() == i-k)
            deque.removeFirst();
        while(!deque.isEmpty() && nums[i] > nums[deque.getLast()])
            deque.removeLast();
    }
    public int [] maxInEveryContiguousArray(int [] nums, int k){
        int len = nums.length;
        if(len*k == 0) return new int[0];
        if(k==1) return nums;
        int maxIndex = 0;
        for(int i=0;i<len;i++){
            clean_deque(i,k);
            deque.addLast(i);
            if(nums[i]>nums[maxIndex]) maxIndex = i;
        }
        int finArray[] = new int[len -k+1];
        finArray[0] = nums[maxIndex];
        for(int i=k;i<len;i++){
            clean_deque(i,k);
            deque.addLast(i);
            finArray[i-k+1] = deque.getLast();
        }
        return finArray;
    }
}

