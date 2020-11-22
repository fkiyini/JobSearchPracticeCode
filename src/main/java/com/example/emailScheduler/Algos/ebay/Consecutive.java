package com.example.emailScheduler.Algos.ebay;

import java.util.HashMap;
import java.util.Map;

public class Consecutive {
    public static Map<Character, Integer> soln(String s) {
        int i = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (i < s.length()) {
            Character c = s.charAt(i);
            boolean isRepeated = false;
            while (i + 1 < s.length() && s.charAt(i + 1) == c) {
                isRepeated = true;
                i++;
            }
            if (isRepeated) {
                map.put(c, map.getOrDefault(c, 0) + 1);
//                map.put(c,map.get(c)+1);
            }
            i++;
        }
        return map;
    }

    public static void main(String[] args) {
        String str = "abbbcddddeffabbbbbb";
        System.out.println(soln(str));
    }
}
