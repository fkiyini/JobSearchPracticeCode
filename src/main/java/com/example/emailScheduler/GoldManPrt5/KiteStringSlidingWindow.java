package com.example.emailScheduler.GoldManPrt5;

import java.util.ArrayDeque;

public class KiteStringSlidingWindow {
    ArrayDeque<Integer> deque = new ArrayDeque<>();
    int [] nums;
    public  void clean_deque(int i, int k){
        while (!deque.isEmpty() && deque.getFirst() == i-k){
            deque.removeFirst();
        }
        while (deque.isEmpty() && nums[i]<nums[deque.getLast()]){
            deque.removeLast();
        }
    }
    public int [] maxOfMinimums(int [] nums, int k){
        int maxMin = 0;
        int len = nums.length;
        if(len * k == 0) return new int[0];
        if(k==1) return nums;
        for (int i = 0;i<k;i++){
            clean_deque(i,k);
            deque.addLast(i);
            if (nums[i]<nums[maxMin]) maxMin = i;
        }
        int finList [] = new int[len-k+1];
        int max = nums[maxMin];
        finList[0] = nums[maxMin];
        for (int i=k;i<len;i++){
            clean_deque(i,k);
            deque.addLast(i);
            finList[k-i+1] = deque.getLast();
            max = Math.max(max,deque.getLast());
        }
        return null;
    }
}
