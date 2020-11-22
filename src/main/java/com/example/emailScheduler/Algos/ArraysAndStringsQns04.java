package com.example.emailScheduler.Algos;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class ArraysAndStringsQns04 {

    public static int isPermutationOfPalindrome(String str){
        boolean isFound = false;
        int k = 1;
        Hashtable<Character,Integer> hashtable = new Hashtable<>();
        for (int i =0;i<str.length();i++){
            if (!hashtable.containsKey(str.charAt(i))){
                hashtable.put(str.charAt(i),k);

            }
            else {
                hashtable.put(str.charAt(i),hashtable.get(str.charAt(i))+1);
            }
        }
        System.out.println(hashtable);
        for(Entry<Character,Integer> entries : hashtable.entrySet()){
//            System.out.println(entries.getValue());
           if(entries.getValue()%2 == 1){
               if(isFound){
                   return 0;
               }
               isFound = true;
           }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("TacTcoa"));
    }

}
