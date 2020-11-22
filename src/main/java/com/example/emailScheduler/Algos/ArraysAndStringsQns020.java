package com.example.emailScheduler.Algos;

import java.util.HashMap;

public class ArraysAndStringsQns020 {

//    public String sortString(String str){
//        int len=0,i=1;
//        char min  = str.charAt(0),temp;
//        while (len == str.length()-1){
//            if (str.charAt(i)<min){
//                min = str.charAt(i);
//                i++;
//            }
//            len++;
//        }
//        sortString(str.substring())
//    }

    public int testPermutations(String str2, String str1){
        int len = 0, i=0;
        HashMap <Character, Integer>hashMap = new HashMap();
        if(str1.length()!= str2.length()) {
            return 0;
        }
        else {
            while (len< str1.length()){
                if (hashMap.containsKey(str1.charAt(i))){

                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        String str1 = "ABC";

        String str2 = "BAC";


    }
}
