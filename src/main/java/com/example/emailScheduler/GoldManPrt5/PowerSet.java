package com.example.emailScheduler.GoldManPrt5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {
    public static List isPowerSet(String string){
        List<Set<Character>> powerSets = new ArrayList<>();
        powerSets.add(new HashSet<Character>());
        for (char ch : string.toCharArray()){
            int len = powerSets.size();
            for(int i = 0;i<len;i++){
                Set<Character> subSet = powerSets.get(i);
                Set<Character> temp = new HashSet<>(subSet);
                temp.add(ch);
                powerSets.add(temp);
            }
        }
        return powerSets;
    }
    public static void main(String[] args) {

        String str = "123";
        System.out.println(isPowerSet(str));
    }
}
