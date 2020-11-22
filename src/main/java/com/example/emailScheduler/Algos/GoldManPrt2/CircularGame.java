package com.example.emailScheduler.Algos.GoldManPrt2;

public class CircularGame {
    public static int circularGame(int N , int k){
    if(N==1)
        return 1;
    else return (circularGame(N-1,k)+k-1)%N+1;
    }

    public static void main(String[] args) {
        System.out.println(circularGame(6,2));
    }
}
