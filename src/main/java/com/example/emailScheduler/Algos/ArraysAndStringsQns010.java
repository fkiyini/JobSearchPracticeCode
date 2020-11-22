package com.example.emailScheduler.Algos;

import java.util.HashMap;

public class ArraysAndStringsQns010 {

    public static void main(String[] args) {
        int len = 0;
        int i = 0;
        String str = "Farouk";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        while (len < str.length()) {
            if (hashMap.containsKey(str.charAt(i))) {
                break;
            }
            else{
                hashMap.put(str.charAt(i),1);
                i++;
                len++;
            }
        }
        System.out.println(hashMap.toString());

    }
}
