package com.example.emailScheduler.Algos.GoldManPrt3;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public static List primeFactorList(int num){
        int i = 2;
        List list = new ArrayList();
        while (i<=num){
            if(num%i == 0){
                num/=i;
                list.add(i);
            }
            else
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(primeFactorList(24));
    }
}
