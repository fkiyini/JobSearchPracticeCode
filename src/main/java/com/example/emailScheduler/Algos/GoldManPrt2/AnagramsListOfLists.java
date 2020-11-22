package com.example.emailScheduler.Algos.GoldManPrt2;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class AnagramsListOfLists {
    public static List anagrams( String [] str ){
//        HashMap <String, List<String>> hashMap = new HashMap<>();
        TreeMap <String,List<String>> linkedHashMap = new TreeMap<>();
        for(int i=0;i<str.length;i++){
            String word = str[i];
            char [] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            if(linkedHashMap.containsKey(newWord)){
                linkedHashMap.get(newWord).add(word);
            }
            else {
                List list = new ArrayList();
                list.add(word);
                linkedHashMap.put(newWord,list);
            }
        }
        System.out.println(linkedHashMap);
        List list = new ArrayList();
//        for (Map.Entry<String,List<String>> newMap:linkedHashMap.entrySet()){
//
//            list.add(newMap.getValue());
//        }
        linkedHashMap.values().stream().forEach(newList ->list.add(newList));
        return list;
    }

    public static void main(String[] args) {
//        List <String>list = Arrays.asList("art","cheese","cat","rat","tar","act","tca");
        String [] list = {"art","cheese","cat","rat","tar","act","tca"};
        System.out.println(anagrams(list));
    }
}
