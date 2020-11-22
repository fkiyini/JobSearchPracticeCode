package com.example.emailScheduler.Algos.GoldManPrt3;

import java.util.*;

public class Occurrences {
    public static String charOccurrences(String str){
        String str1 = "";
        int i =0;
        while(i<str.length()){
            int count = 1;
            while (i+1<str.length() && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            str1 = str1 +str.charAt(i)+count;
            i++;
        }
        return str1;
    }
    public static String oddOccurrences(String str){
        String str1 = "";
        int k=0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(!hashMap.containsKey(str.charAt(i)))
                hashMap.put(str.charAt(i),1);
            else
            hashMap.put(str.charAt(i),hashMap.get(str.charAt(i))+1);

            if(hashMap.get(str.charAt(i))%2!=0){
                str1 = str1+ str.charAt(i);
            }
        }
//        return hashMap;
        return str1;
    }
    public static LinkedHashMap<Character ,Integer> sequenceCount(String str){
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        int i=0;
        while(i<str.length()){
            Character c = str.charAt(i);
            boolean isFound = false;
//            if(c!=str.charAt(i+1)){
//                i++;
//            }
            while(i+1<str.length() && c==str.charAt(i+1)){
                    i++;
                    isFound = true;
            }
            if(isFound){
//                hashMap.put(str.charAt(i),hashMap.getOrDefault(str.charAt(i),0)+1);
                if(!hashMap.containsKey(str.charAt(i))){
                    hashMap.put(str.charAt(i),1);
                }
                else {
                    hashMap.put(str.charAt(i),hashMap.get(str.charAt(i))+1);
                }
//                isFound = false;
            }
             i++;
        }
        return hashMap;
    }
    public static List<List<String>> setOfAnagrams(String [] strings){
        LinkedHashMap <String, List<String>> listLinkedHashMap = new LinkedHashMap<>();
        for (String oldWord : strings){
            char[] letters = oldWord.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);
            if(!listLinkedHashMap.containsKey(newWord))
                listLinkedHashMap.put(newWord, new ArrayList<>());
//            listLinkedHashMap.put(newWord, listLinkedHashMap.get(newWord).add(oldWord));
            listLinkedHashMap.get(newWord).add(oldWord);
        }

        List<List<String>> solution =  new ArrayList<>();
      listLinkedHashMap.values().stream().forEach(list -> solution.add(list));
      return solution;
    }
    public static char firstOccurrenceCharInNonRepeatedString(String string) throws Exception {
        LinkedHashMap <Character,Integer> linkedHashMap =  new LinkedHashMap<>();
        char [] letters = string.toCharArray();
        for(char ch:letters){
            if(!linkedHashMap.containsKey(ch)){
                linkedHashMap.put(ch, 1);
            }
            else {
                linkedHashMap.put(ch,linkedHashMap.get(ch)+1);
            }
        }
        Optional<Character> firstUnique = string.chars()
                .mapToObj(ch ->(char)ch)
                .filter(i->linkedHashMap.get(i) == 1)
                .findFirst();
        if(firstUnique.isPresent())
            return firstUnique.get();
        throw new Exception(" there isn't non");
//        return 'r';
    }
    public static void main(String[] args) throws Exception {
        System.out.println(charOccurrences("abeockieeeeo"));
        System.out.println(oddOccurrences("qqsaaaroeppddlsqq"));
        System.out.println(sequenceCount("qqsaaaroeppddlsqq"));
        String [] list = {"art","cheese","cat","rat","tar","act","tca"};
        System.out.println(setOfAnagrams(list));
        String str = "aabbkkllnmmmo";
        System.out.println(firstOccurrenceCharInNonRepeatedString(str));

    }
}
