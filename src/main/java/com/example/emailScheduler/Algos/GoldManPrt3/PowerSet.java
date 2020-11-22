package com.example.emailScheduler.Algos.GoldManPrt3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {
    public static List<Set<Character>> thePowerSet(String string){
        return getSets(string);
    }

    private static List<Set<Character>> getSets(String string) {
        List<Set<Character>> powerSet = new ArrayList<>();
        powerSet.add(new HashSet<>());
        for(int i = 0;i<string.length();i++){
            int len = powerSet.size();
            for(int j = 0;j<len;j++){
                Set<Character> subSet = powerSet.get(j);
                Set<Character> temp = new HashSet<>(subSet);
                temp.add(string.charAt(i));
                powerSet.add(temp);
            }
        }
        return powerSet;
    }

    public static List<Set<Character>> thePowerSet1(String string){
        return getSets(string);
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(thePowerSet(str));
    }
}
