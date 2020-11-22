package com.example.emailScheduler.Algos.KiteSpring;

import java.util.*;

public class SlidingWindow {

    public static int[] maxForEachContiguousSubArray(int arr [],int k){
        int [] newArray = new int[arr.length+1-k];
        int e=0;
        for(int i=0;i<arr.length-k+1;i++){
            int max = arr[i];
            for(int j=i+1;j<k+i;j++){
               max = Math.max(arr[j],max);
            }
            newArray[i] = max;
//            e++;
        }
        return newArray;
    }
    ArrayDeque<Integer> deque = new ArrayDeque<>();
    int [] nums;
    public  void cleanDeque(int i, int k){
      if(!deque.isEmpty() && deque.getFirst() == i-k)  {
        deque.removeFirst();
      }
      while (!deque.isEmpty() && nums[i] > nums[deque.getLast()]){
          deque.removeLast();
      }
    }
    public  int [] maxValue(int nums [],int k){
        int n = nums.length;
        if(n * k == 0) return new int[0];
        if(k == 1) return nums;

        int max_idx = 0;
        for (int i=0;i<k;i++){
            cleanDeque(i,k);
            deque.addLast(i);
            if(nums[i]>nums[max_idx]) max_idx = i;
        }
        int [] inPutz = new int[n-k+1];
        inPutz[0] = nums[max_idx];
        for (int i=k;i<n;i++){
            cleanDeque(i,k);
            deque.addLast(i);
            inPutz[i-k+1] = nums[deque.getFirst()];
        }
        return inPutz;
    }

    ArrayDeque <Integer> deq = new ArrayDeque<Integer>();
    int num [];
    public void cleanDeq(int i, int k){
        if(!deq.isEmpty() && deq.getFirst() == i-k)
            deq.removeFirst();
        while (!deq.isEmpty() && nums[i] > nums[deq.getLast()])
            deq.removeLast();
    }
    public int[] maxNum(int nums[] , int k){
        int n = nums.length;
        if(n*k == 0) return new int[0];
        if(k == 1) return nums;
        int maxValue=0;
        for (int i = 0; i<k;i++){
            cleanDeq(i,k);
            deq.addLast(i);
            if (nums[i] > nums[maxValue]) maxValue = i;
        }
        int inPuts[] = new int[n-k+1];
        inPuts[0]=nums[maxValue];
        for (int i=k;i<n;i++){
            cleanDeq(i,k);
            deq.addLast(i);
            inPuts[i-k+1] = nums[deq.getFirst()];
        }
        return inPuts;
    }

    ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
    int[] nu;
    public void cleanTheDeque(int i, int k){
        if(!arrayDeque.isEmpty()&&arrayDeque.getFirst()==i-k){
            arrayDeque.getFirst();
        }
        while(!arrayDeque.isEmpty() && nu[i]>nu[arrayDeque.getLast()]){
            arrayDeque.removeLast();
        }
    }
    public int[] maxiNum(int [] nums, int k){
        int n = nums.length;
        if(n*k == 0) return new int[0];
        if (k == 1) return nums;
        int maxIndex = 0;
        for(int i = 0;i<k;i++){
            cleanTheDeque(i,k);
            arrayDeque.addLast(i);
            if(nums[i]>nums[maxIndex]) maxIndex = i;
        }
        int inPut[] = new int[n - k+1];
        inPut[0] = nums[maxIndex];
        for (int i = k;i<n;i++){
            cleanTheDeque(i,k);
            arrayDeque.addLast(i);
            inPut[i-k+1] = nums[arrayDeque.getFirst()];
        }
        return inPut;
    }

    ArrayDeque<Integer> newDeq = new ArrayDeque<>();
    int numbers[];
    public void cleaningDeque(int i,int k){
        if(!newDeq.isEmpty()&&newDeq.getFirst() == i-k){
            newDeq.removeFirst();
        }
        while (!newDeq.isEmpty() && numbers[i] > numbers[newDeq.getLast()]){
            newDeq.removeLast();
        }
    }
    public int[] maxNumbers(int numbers[], int k){
        int n = numbers.length;
        int maxIndex = 0;
        if(n*k ==0) return new int[0];
        if(k==1) return numbers;
        for(int i = 0;i<k;i++){
            cleanDeque(i,k);
            newDeq.addLast(i);
            if(numbers[i]>numbers[maxIndex]) maxIndex = i;
        }

        int []inPUTS = new int[n-k+1];
        inPUTS[0]=numbers[maxIndex];
        for(int i=k;i<n;i++){
            cleanDeque(i,k);
            newDeq.addLast(i);
            inPUTS[i-k+1] = numbers[newDeq.getFirst()];
        }
        return inPUTS;
    }

    public static void main(String[] args) {
        int [] arr = {6,7,6,7};
        System.out.println(Arrays.toString(maxForEachContiguousSubArray(arr,4)));
    }
}
