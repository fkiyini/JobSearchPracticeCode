package com.example.emailScheduler.GoldManPrt5;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List arePrimeFactors(int n){
        int i = 2;
        List list = new ArrayList();
        while (i<=n){
            if (n%i == 0)  {
                list.add(i);
                n/=i;
            }
            else i++;
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(arePrimeFactors(24));
    }
}
