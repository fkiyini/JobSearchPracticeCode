package com.example.emailScheduler.Algos.GoldManPrt2;

import java.util.HashMap;

public class CountingCharacterOccurrences {

    public static HashMap <Character,Integer> countingCharacterOccurrencesBySequence(String str){
        String str1  = "";
        HashMap <Character,Integer> hashMap = new HashMap<>();
        int i=0,j=0;
        while (i<str.length()-1){
            boolean isFound = false;
            if(str.charAt(i)!= str.charAt(i+1))
                i++;
            else {
                while (i+1<str.length() && str.charAt(i) == str.charAt(i+1) ){
                    isFound = true;
                    i++;
                }
                if(isFound){
                    hashMap.put(str.charAt(i),hashMap.getOrDefault(str.charAt(i),0)+1);
                }
            }
        }
        return hashMap;
    }
    public static String countingCharacterOccurrences(String str){
        String str2  = "";
        int i=0,count=1;
        while (i<str.length()-1) {
            char c = str.charAt(i);
            if (c != str.charAt(i + 1)) {
                i++;
                str2 = str2 + c + "" + count;
            } else {
                while (i + 1 < str.length() && c == str.charAt(i + 1)) {
                    count++;
                    i++;
                }
                str2 = str2 + c + "" + count;
                i++;
                count = 1;
            }
        }
        System.out.println(i);
        if(i == str.length()-1 && str.charAt(i) != str.charAt(i-1)){
            str2 = str2 +str.charAt(i)+""+count;
        }
        return str2;
    }
    public static String isCharacterOccurrences(String str){
        String str1 = "";
        int count = 1, i=0;
        while (i<str.length()-1){
            char c = str.charAt(i);
            if (c!=str.charAt(i+1)){
                str1 = str1 +c+count;
                i++;
            }else {
                while (i+1<str.length() && c==str.charAt(i+1)){
                    count++;
                    i++;
                }
                str1 = str1+c+count;
                count = 1;
                i++;
            }
        }
        if(i==str.length()-1 && str.charAt(i) != str.charAt(i-1))
            str1 = str1+str.charAt(i)+count;
        return str1;
    }

    public static String isCharacterOccurrences2(String str){
        String str1 = "";
        int count = 1, i=0;
        while (i<str.length()){
            char c = str.charAt(i);
            count = 1;
            while (i+1<str.length() && c==str.charAt(i+1)){
                count++;
                i++;
            }
            str1 += c+""+count;
            i++;
        }

        return str1;
    }
    public static void main(String[] args) {
//        String str = "abbbcddddeffabbbbbb";
//        String str = "aab";
        String str = "baabbxyz";
        //b1a2b2
//        System.out.println(countingCharacterOccurrencesBySequence(str));
//        System.out.println(countingCharacterOccurrences(str));
        System.out.println(isCharacterOccurrences2(str));
    }
}
