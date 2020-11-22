package com.example.emailScheduler.Algos.GoldManPrt2.Revision01;

import java.util.*;

public class Anagrams {
    public static boolean areAnagrams(String str1, String str2) {
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        String newWord1 = new String(str1Array);
        Arrays.sort(str2Array);
        String newWord2 = new String(str2Array);
        return newWord1.equals(newWord2) ? true : false;
    }

    public static Character theFirstUniqueChar(String str) throws Exception {
        Set<Character> set = new HashSet<Character>();
        String string = "";
        int i = 0;
        while (i < str.length()) {
            if (!set.add(str.charAt(i)))
                string += str.charAt(i);
            i++;
        }
        i = 0;
        System.out.println(set);
        while (i < str.length()) {
            if (!string.contains(str.charAt(i) + ""))
                return str.charAt(i);
            i++;
        }

        System.out.println(set);
        throw new Exception("Unique Character not found");
    }

    public static List isAnagramGroup(String[] strings) {
        Map<String, List<String>> hashMap = new HashMap<>();
        for (String string : strings) {
            char[] letters = string.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);
            if (hashMap.containsKey(newWord)) {
                hashMap.get(newWord).add(string);
            } else {
                List<String> list = new ArrayList<>();
                list.add(string);
                hashMap.put(newWord, list);
            }
        }
        System.out.println(hashMap);
        List list = new ArrayList<>();
        for (Map.Entry<String, List<String>> hMap : hashMap.entrySet()) {

            list.add(hMap.getValue());
        }
        return list;
    }

    public static List isAnagramGroup01(String[] strings) {
        LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<>();
        for (String string : strings) {
            char[] letters = string.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);
            if (!linkedHashMap.containsKey(newWord))
                linkedHashMap.put(newWord, new ArrayList<>());
            linkedHashMap.get(newWord).add(string);
        }
        List nList = new ArrayList();
        for (Map.Entry<String, List<String>> newLHM : linkedHashMap.entrySet()) {
            nList.add(newLHM.getValue());
        }
        return nList;
    }

    public static void main(String[] args) throws Exception {

        System.out.println(areAnagrams("dog", "god"));
        System.out.println(theFirstUniqueChar("aaccbddka"));


        String[] strings2 = {"cab", "tin", "pew", "duh", "may", "ill", "buy", "bar", "max", "doc"};
        String[] list = {"art", "cheese", "cat", "rat", "tar", "act", "tca"};
        System.out.println(isAnagramGroup01(list));
    }
}
