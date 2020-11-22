package com.example.emailScheduler.Algos.GoldManPrt3;

import java.util.ArrayList;
import java.util.List;

public class AllPossiblePermutations {
    public static void allPossiblePermutations(String string, String ans){
        if(string.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        for(int i = 0;i<string.length();i++){
            char ch  = string.charAt(i);
            String ros = string.substring(0,i) + string.substring(i+1);
            allPossiblePermutations(ros, ans+ch);
        }
    }
    public static void allPossiblePermutations1(String string, String ans , List<String > list){
        if(string.length() == 0){
//            System.out.print(ans + " ");
            list.add(ans);
            return;
        }
        for (int i=0;i<string.length();i++){
            char ch = string.charAt(i);
            String ros = string.substring(0,i) + string.substring(i+1);
            allPossiblePermutations1(ros, ans+ch, list);
        }

    }
    public static List<String> actualFn(String s){
        List<String> list = new ArrayList<>();
        allPossiblePermutations1(s," ", list);
        return list;
    }
    public static void main(String[] args){
        String s = "abc";
//        actualFn(s);
        System.out.println("actualFn(s) = " + actualFn(s));
    }
}
