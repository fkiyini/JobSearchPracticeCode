package com.example.emailScheduler.Algos.GoldManPrt2;

import java.lang.reflect.Array;
import java.util.*;

public class PrimeFactor {

    public static List<Integer> primeFactor(Integer n){
        Integer i =2;
        List<Integer>list = new ArrayList<>();
        while (i<=n){
            if(n%i==0){
               list.add(i);
               n/=i;
            }
            else i++;
        }
        return list;
    }
    public static String arrayToString(String [] arr){
        //String str = new String(String.valueOf(arr));
        String str1 = "";
        for (int i=0;i<arr.length;i++){
            str1 += arr[i];
        }
        char [] str = str1.toCharArray();
        System.out.println(str);
        Arrays.sort(str);
        //return Long.parseInt(new String(str1));
         String ste = new String(str1);
         return ste;
    }

    public static String merge(int [] arr1, int[] arr2){
        int [] arr3 = new int[arr1.length+arr2.length];
        int i=0,i1=0,i2=0;
//        if(arr1[0]>=arr2[arr2.length-1]){
//            while(i<arr3.length){
//                if(i2<arr2.length){
//                    arr3[i]=arr2[i2];
//                    i2++; i++;
//                }
//                else{
//                    arr3[i]=arr1[i1];
//                    i1++;i++;
//                }
//            }
//        }
//        else if(arr2[0]>=arr1[arr1.length-1]) {
//            while(i<arr3.length){
//                if(i1<arr1.length){
//                    arr3[i]=arr1[i1];
//                    i1++;i++;
//                }
//                else{
//                    arr3[i]=arr2[i2];
//                    i2++;i++;
//                }
//            }
//        }
//        else {
            while (i<arr3.length) {
                if (arr2.length > i2 && arr1.length > i1) {
                    if (arr1[i1] >= arr2[i2]) {
                        arr3[i] = arr2[i2];
                        i2++;
                        i++;
                    } else {
                        arr3[i] = arr1[i1];
                        i1++;
                        i++;
                    }
                } else {
                    while (i < arr3.length) {
                        if (i1 < arr1.length) {
                            arr3[i] = arr1[i1];
                            i1++;
                            i++;
                        } else {
                            arr3[i] = arr2[i2];
                            i2++;
                            i++;
                        }
                    }
                }
            }

        return Arrays.toString(arr3);
    }

    public static void main(String[] args) {
        int [] arr = {1, 34, 3, 98, 9, 76, 45, 4};
        List list = Arrays.asList(1, 34, 3, 98, 9, 76, 45, 4);
        String [] arr1 = {"er","ty","gh","oo"};
        int [] ar1 = { 5, 8, 9}; int [] ar2 = {4, 7, 8};
        System.out.println(primeFactor(315));
        System.out.println(arrayToString(arr1));
        System.out.println(merge(ar1,ar2));
//        Collections.sort(list, new ValueComparator());
        System.out.println(list);
    }


}
