package com.example.emailScheduler.Algos.GoldManPrt3;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumAfterStrConcatComparator {
    public static String largestNumberAfterStringConcatenation(int [] arr){
        String string [] = new String[arr.length];
        String result = "";
        for(int i=0; i<arr.length;i++){
             string[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(string, new LargestNumberAfterStringConcatenationComparator());
        System.out.println(Arrays.toString(string));
        if(string[0].equals("0"))
            return "0";
        else {
            for(int i = 0;i<string.length;i++){
                result += string[i];
            }
        }
        return result;
    }
    private static class LargestNumberAfterStringConcatenationComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            String a = o1 + o2;
            String b = o2 + o1;
            return b.compareTo(a);
        }
    }
    public static void main(String[] args) {
//        List list = Arrays.asList(1, 34, 3, 98, 9, 76, 45, 4);
        int[] list = {1, 34, 3, 98, 9, 76, 45, 4};
        System.out.println(largestNumberAfterStringConcatenation(list));
    }
}
