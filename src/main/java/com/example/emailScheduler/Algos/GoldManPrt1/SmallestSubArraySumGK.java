package com.example.emailScheduler.Algos.GoldManPrt1;

public class SmallestSubArraySumGK {
    public static int smallestSubArraySumGK(int [] A, int k){
        int max=A.length;
        int sum1 = 0,count =0;
        for (int i:A){
            sum1+=i;
            count++;
        }
        if(A[0]>k) return 1;
        else if(sum1<=k) return -1;
        else if(sum1-A[max-1]<k && count == max) return max;
        else {
            for (int i=0;i<A.length;i++){
                int sum = A[i];
                for (int j = i+1;j<A.length;j++){
                    sum+=A[j];
                    if(sum>k && (j<max)){
                        max = j;
                    }
                    else if(sum>k && j>=max-1){
                        return max;
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
//        int arr[] = {1, 4, 45, 6, 0, 19};
//        int arr[] = {1, 10, 5, 2, 7};
        int arr [] = {1,2};
        System.out.println(smallestSubArraySumGK(arr,24));
    }
}
