package com.example.emailScheduler.Algos.ebay;

public class SingletonPattern {
    private static SingletonPattern singletonPattern;
    private SingletonPattern(){ }
    public static SingletonPattern getInstance(){
        if(singletonPattern == null)
            singletonPattern = new SingletonPattern();
        return singletonPattern;
    }
}
