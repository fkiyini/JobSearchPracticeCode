package com.example.emailScheduler.Algos.KiteSpring;

import java.util.ArrayDeque;
import java.util.List;

public class MaxOfMinContiguousArray {
    static ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
    static List<Integer> numbs;

    public static void clean_deque(int i, int k) {
        if (!deq.isEmpty() && deq.getFirst() == i - k)
            deq.removeFirst();
        while (!deq.isEmpty() && numbs.get(i) < numbs.get(deq.getLast()))
            deq.removeLast();
    }

    public static int segment(int k,List<Integer> space) {
        int n = space.size();
        numbs = space;
        int min_idx = 0;
        for (int i = 0; i < k; i++) {
            clean_deque(i, k);
            deq.addLast(i);
            if (space.get(i) < space.get(min_idx)) min_idx = i;
        }
        int result = space.get(min_idx);

        for (int i  = k; i < n; i++) {
            clean_deque(i, k);
            deq.addLast(i);
            result = Math.max(result,space.get(deq.getFirst()));
        }
        return result;
    }
    ArrayDeque<Integer> deque = new ArrayDeque<>();
    int [] numbers;

    public void cleanUpDeque(int i, int k){
        if(!deque.isEmpty() && deque.getFirst() == i-k){
            deque.removeFirst();
        }
        while(!deque.isEmpty() && numbers[i] <numbers[deque.getLast()]){
            deque.removeLast();
        }
    }
    public int maxOfMin(int [] numbers , int k){
        int n = numbers.length;
        int minIndex = 0;
//        if(n*k ==0) return 0;
//        if(k==1) return -1;
        for(int i=0;i<k;i++){
            cleanUpDeque(i,k);
            deque.addLast(i);
            if(numbers[i]<numbers[minIndex]) minIndex = i;
        }
//        int inPut[] = new int[n-k+1];
//        inPut[0] = numbers[minIndex];

        int min = numbers[minIndex];
        for(int i=k;i<n;i++){
            cleanUpDeque(i,k);
            deque.addLast(i);
            min = Math.min(min,numbers[deque.getFirst()]);
//            inPut[i-k+1] = numbers[deque.getFirst()];
        }
        return min;
    }

}
