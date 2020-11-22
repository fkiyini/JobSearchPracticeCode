package com.example.emailScheduler.GoldManPrt5;

public class FindSecondSmallestAndSecondBiggest {
    public static int isFindSecondSmallest(int arr[]) throws Exception{
    int first , second, len = arr.length;
    if (len<2) throw new Exception("nayee babe");
    first = second = Integer.MAX_VALUE;
    for (int i=0;i<len;i++){
        if (arr[i] < first){
            second = first;
            first = arr[i];
        }
        else if (arr[i]<second && arr[i] !=first){
            second = arr[i];
        }
    }
        if (second == Integer.MAX_VALUE)
            throw new Exception("there is no second smallest");
        else return second;
    }
    public static int isFindSecondBiggest(int arr[]) throws Exception{
        int first,second,len=arr.length;
        first = second = Integer.MIN_VALUE;
        for (int i=0;i<len;i++){
            if (first<arr[i]){
                second = first;
                first = arr[i];
            }
            else if (arr[i]>second && arr[i]!=first){
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE)
            throw new Exception("there is none");
        else return second;
    }
    public static int isFindSecondSmallest1(int [] arr) throws Exception{
        int first, second, len = arr.length;
        first=second=Integer.MAX_VALUE;
        for (int i=0;i<len;i++){
            if(first>arr[i]){
                second = first;
                first = arr[i];
            }
            else if(arr[i]<second && arr[i] != first){
                second = arr[i];
            }
        }
        if (second == Integer.MAX_VALUE) throw new Exception("hi Babe");
        return second;
    }
    public static int isFindSecondSmallest2(int [] arr) throws Exception{
        int first,second,len = arr.length;
        first = second = Integer.MAX_VALUE;
        for (int i=0;i<len;i++){
            if (arr[i]<first){
                second = first;
                first = arr[i];
            }
            else if (arr[i]<second && arr[i]!=first){
                second = arr[i];
            }
        }
        if (second == Integer.MAX_VALUE) throw new Exception("Hi bro");
        return second;
    }
    public static void main(String[] args) throws  Exception{
        int [] Example = {-142, -13, -13, 10, 34, 1};
        System.out.println(isFindSecondSmallest2(Example));
        System.out.println(isFindSecondBiggest(Example));
    }

}
