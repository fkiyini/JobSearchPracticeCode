package com.example.emailScheduler.GoldManPrt5;

public class CircularGame {
    public static int isCircularGame(int n, int k){
        if (k==1) return 1;
        else
            return (isCircularGame(n-1,k)+k-1)%n+1;
    }
    public static int isCircularGame1(int n, int p){
        if (p==1) return 1;
        else return (isCircularGame1(n-1,p)+p-1)%n+1;
    }
    public static void main(String[] args) {
        System.out.println(isCircularGame(6,2));
    }
}
