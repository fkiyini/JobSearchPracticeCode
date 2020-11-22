package com.example.emailScheduler.GoldManPrt5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Optional;

public class Combinations {
    public static String oddOccurences(String s){
        String str = "";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hashMap.containsKey(s.charAt(i)))
                hashMap.put(s.charAt(i),0);
            hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);

            if(hashMap.get(s.charAt(i))%2==1)
                str+=s.charAt(i);
        }
        return str;
    }
    public static void isFirstNonRepeatedOccur(String string) throws Exception{
        HashMap <Character,Integer> linkedHashMap = new HashMap<>();
        for(int i=0;i<string.length();i++){
            if (!linkedHashMap.containsKey(string.charAt(i)))
                linkedHashMap.put(string.charAt(i),0);
            linkedHashMap.put(string.charAt(i),linkedHashMap.get(string.charAt(i))+1);
        }
        Optional<Character> firstChar = string.chars()
                .mapToObj(ch ->(char)ch)
                .filter(i->linkedHashMap.get(i) == 1 )
                .findFirst();
        firstChar.ifPresent(System.out::println);
//        if (firstChar.isPresent())
//            return firstChar.get();
//        else throw new Exception("hi babe");
    }
    public static String numOccurrences(String string){
        String str = "";
        int i=0;
        while (i<string.length()){
            char ch = string.charAt(i);
            int count = 1;
            while (i+1<string.length() && ch == string.charAt(i+1)){
                count++;
                i++;
            }
            str=str+string.charAt(i)+count;
            i++;
        }
        return str;
    }
    public static HashMap numOfSequenceOccurrences(String string){
        HashMap<Character ,Integer> hashMap = new HashMap<>();
        String str = "";
        int i = 0;
        while (i<string.length()){
            char ch = string.charAt(i);
            Boolean isFound = false;
            while (i+1 < string.length() && ch == string.charAt(i+1)){
                i++;
                isFound = true;
            }
            if (isFound){
               hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
//                if(!hashMap.containsKey(ch))
//                    hashMap.put(ch,0);
//                hashMap.put(ch,hashMap.get(ch)+1);
            }
            i++;
        }
        return hashMap;
    }

    public static void main(String[] args) throws Exception{
//        System.out.println(oddOccurences("aaabbbcccaaadewn"));
        String str = "aabbkkllnnmmmooo";
        isFirstNonRepeatedOccur(str);
        System.out.println(numOccurrences(str));
        System.out.println(numOfSequenceOccurrences("aaabbbcccaaadewn"));
    }

}
