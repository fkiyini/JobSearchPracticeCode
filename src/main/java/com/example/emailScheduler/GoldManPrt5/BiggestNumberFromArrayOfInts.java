package com.example.emailScheduler.GoldManPrt5;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNumberFromArrayOfInts {
    public static Long  isBiggestNumberFromArrayOfInts(int [] arr){
        if (arr.length == 0) return Long.valueOf(-1);
        String [] str = new String[arr.length];
        String strings = new String();
        for (int i=0;i<arr.length;i++){
            str[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(str, new isBiggestNumberFromArrayOfIntsComparator());
        if(str[0].equals("0"))
            return Long.valueOf(0);
        else {
            for(String i :str){
                strings = strings+i;
            }
        }
//        Long.parseLong();
        return Long.valueOf(strings);
    }
    private static class isBiggestNumberFromArrayOfIntsComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            String a = o1+o2;
            String b = o2+o1;
            return b.compareTo(a);
        }
    }
//    private static class isBiggestNumberFromArrayOfIntsComparator {
//        Comparator<String> comp = (String o1, String o2) -> {
//            String a = o1+o2;
//            String b = o2+o1;
//            return b.compareTo(a);
//        };
//    }
    public static void main(String[] args) {
//        List list = Arrays.asList(1, 34, 3, 98, 9, 76, 45, 4);
        int[] list = {1, 34, 3, 98, 9, 76, 45, 4};
        System.out.println(isBiggestNumberFromArrayOfInts(list));
    }
}
