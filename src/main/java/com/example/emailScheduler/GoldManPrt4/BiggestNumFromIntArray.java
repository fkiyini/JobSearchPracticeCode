package com.example.emailScheduler.GoldManPrt4;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNumFromIntArray {
    public static Long isBiggestNumFromIntArray(int arr []){
        if(arr.length == 0){
            return Long.valueOf(-1);
        }
        String [] strings = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            strings[i] = "" +arr[i];
        }
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings, new BiggestNumFromIntArrayComparator());
        System.out.println(Arrays.toString(strings));
        if(strings[0].equals("0"))
            return Long.valueOf(0);
        String strFinal = "";
        for(String str : strings){
            strFinal+=str;
        }
        Long x = Long.parseLong(strFinal);
//        Long x1 = Long.valueOf(strFinal);

        return x;
    }
    private static class BiggestNumFromIntArrayComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            String a = o1+o2;
            String b = o2+o1;
            return b.compareTo(a);
        }
    }
    public static void main(String[] args) {
//        List list = Arrays.asList(1, 34, 3, 98, 9, 76, 45, 4);
        int[] list = {1, 34, 3, 98, 9, 76, 45, 4};
        System.out.println(isBiggestNumFromIntArray(list));
    }
}
