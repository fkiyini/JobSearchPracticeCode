package com.example.emailScheduler.GoldManPrt5;

import java.util.*;

public class ListOfAnagrams {
    public static List isListOfAnagrams(String [] arr){
        Map<String ,List<String>> treeMap = new TreeMap<>();
        for(int i =0;i< arr.length;i++){
            String orgWord = arr[i];
            char [] letters = orgWord.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            if (!treeMap.containsKey(newWord))
                treeMap.put(newWord, new ArrayList<>());
            treeMap.get(newWord).add(orgWord);
        }

        List<List<String>> sol = new ArrayList();
//        treeMap.values().stream().forEach(list ->sol.add(list));
        for (Map.Entry<String, List<String>> listEntry : treeMap.entrySet()){
            sol.add(listEntry.getValue());
        }
//        Arrays.sort(sol, new IsListOfAnagramsComparator());
        sol.sort((l1, l2) -> {
            String a = l1.get(0) + l2.get(0);
            String b = l2.get(0) + l1.get(0);
            return a.compareTo(b);
        });
//        Collections.sort(sol, );
//        Collections.sort(sol, new IsListOfAnagramsComparator());
//        Collections.sort(sol, new Comparator<List<String>>() {
//            @Override
//            public int compare(List<String> o1, List<String> o2) {
//                String a = o1.get(0) + o2.get(0);
//                String b = o2.get(0) + o1.get(0);
//                return a.compareTo(b);
//            }
//        });
        return sol;
    }
//    private static class IsListOfAnagramsComparator implements Comparator<List<String>>{
//        @Override
//        public int compare(List<String> o1, List<String> o2) {
//            String a = o1.get(0) + o2.get(0);
//            String b = o2.get(0) + o1.get(0);
//            return a.compareTo(b);
//        }
//
//        @Override
//        public Comparator<List<String>> reversed() {
//            return null;
//        }
//    }
    public static void main(String[] args) {
//        List <String>list = Arrays.asList("art","cheese","cat","rat","tar","act","tca");
        String [] list = {"art","cheese","cat","rat","tar","act","tca"};
        System.out.println(isListOfAnagrams(list));
    }
}
