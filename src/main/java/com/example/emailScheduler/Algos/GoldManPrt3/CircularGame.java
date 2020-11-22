package com.example.emailScheduler.Algos.GoldManPrt3;

public class CircularGame {
    public static int isCircularGameNumber(int n, int k){
        if(n==1)
            return 1;
        return (isCircularGameNumber(n-1,k)+k-1)%n+1;
    }
    public static int isCircularGameNumber1(int n,int k){
        if(n==1) return 1;
        return (isCircularGameNumber1(n-1,k)+k-1)%n+1;
    }
    public static void main(String[] args) {
        System.out.println(isCircularGameNumber(6,2));
    }
}
