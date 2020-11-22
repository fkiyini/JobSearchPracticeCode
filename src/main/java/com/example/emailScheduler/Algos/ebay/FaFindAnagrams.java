package com.example.emailScheduler.Algos.ebay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FaFindAnagrams {
    public static void faFindAnagrams(String[] arr) {

        HashMap<String, List<String>> map = new HashMap<>();
        String word = "";
        for (int i = 0; i < arr.length; i++) {
            word = arr[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            if (map.containsKey(word)) {
                map.get(word).add(newWord);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(word, list);
            }
        }

        for (String s : map.keySet()) {
            List<String> list = map.get(s);
            if (list.size() > 0) {
                System.out.print(list);
            }

        }

    }

    public static void main(String[] args) {
        // Driver program
        String arr[] = {"cat", "dog", "tac", "god", "act"};
        String arr1[] = {"hello", "cat", "raw", "tca", "war", "cta"};
        faFindAnagrams(arr1);
    }

}
