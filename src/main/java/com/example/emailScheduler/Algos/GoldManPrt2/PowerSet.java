package com.example.emailScheduler.Algos.GoldManPrt2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {
    public static List<Set<Character>> powerSetFun(String str, int k){
        List<Set<Character>> powerSet = new ArrayList<>();
        powerSet.add(new HashSet<>());

        for(Character ch : str.toCharArray()){
            int len = powerSet.size();
            for(int i = 0; i<len; i++){
                Set<Character> subSet = powerSet.get(i);
                Set<Character> temp = new HashSet<>(subSet);
                temp.add(ch);
                powerSet.add(temp);
            }
        }
        return powerSet;
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(powerSetFun(str,3));
    }
}
