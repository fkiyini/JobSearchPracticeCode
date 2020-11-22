package com.example.emailScheduler.Algos.GoldManPrt2;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;

import java.util.*;
public class ArrayToBiggestIntegerValue {
    public static String arrayToBiggestIntegerValue(int[] arr){
        String [] strings = new String[arr.length];
        for(int i = 0;i<arr.length;i++){
            strings[i] = String.valueOf(arr[i]);
        }
//        Arrays.sort(strings, new ArrayToBiggestIntegerValueComparator());
        Arrays.sort(strings, (l1, l2) -> {
            String a = l1 + l2;
            String b = l2 + l1;
            return b.compareTo(a);
        });
//        strings.sort((l1, l2) -> {
////            String a = l1 + l2;
////            String b = l2 + l1;
//            return l2.compareTo(l1);
//        });
        if(strings[0].equals("0"))
            return "0";
        String str1 = new String();
        for (String str : strings){
            str1+=str;
        }
        return str1;
    }
    public static void main(String[] args) {
        int [] arr = {1, 34, 3, 98, 9, 76, 45, 4};
        System.out.println(arrayToBiggestIntegerValue(arr));
    }
//    private static class ArrayToBiggestIntegerValueComparator implements Comparator<String >{
//        @Override
//        public int compare(String o1, String o2) {
//            String a = o1 + o2;
//            String b = o2 + o1;
//            return b.compareTo(a);
//        }
//    }
}
