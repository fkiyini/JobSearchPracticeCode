package com.example.emailScheduler.Algos;

import java.util.*;

public class RemoveDups {


    public static String removeDups(String str){

        String str1 = "";
        Set<Character> characterSet = new TreeSet<>();
        for (int i=0;i<str.length();i++){
            if(characterSet.add(str.charAt(i))){
                str1 = str1+str.charAt(i);
            }
        }
        return str1;
    }

    public static String removeFirstDup(String str) {

        Boolean foundIt = false;
        String str1 = "";
        Set<Character> characterSet = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!characterSet.add(str.charAt(i))) {
                str1 = str1 + str.charAt(i);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (!str1.contains("" + str.charAt(i))) {
                return str.charAt(i) + "";
            }
        }
        return "not found";
    }
    public static List arrayList012(List <Integer> arrayList){
        int count0=0,count1=0,count2=0;
        for (int i = 0;i<arrayList.size();i++){
            if (arrayList.get(i) == 0)
                count0++;
            if (arrayList.get(i) == 1)
                count1++;
            if (arrayList.get(i) == 2)
                count2++;
        }
        int i=0;

        while (i<arrayList.size()){
            if (i<count0){
                arrayList.set(i,0);
                i++;
            }
            else if (count1>0){
                arrayList.set(i,1);
                i++;
                count1--;
            }
            else  {
                arrayList.set(i,2);
                i++;
            }
        }

        return arrayList;
    }

    public static int[] uniqueElement(int[] arr){
        int j=0;
        int [] arr2 = new int[arr.length];
        Set set = new TreeSet();

        for(int i=0; i<arr.length;i++){
            if(set.add(arr[i])){
                arr2[j] = arr[i];
                j++;
            }
        }

        return arr2;
    }

    public static int[] uniqueElement1(int[] arr){
        int j=1,i=0;
        while (i<arr.length-2) {
            if (arr[i] != arr[j]) {
                j++;i++;
            } else {
                arr[j] = 0;
                j++;
                if (arr[j] != arr[i]) {
                    i++;
                    arr[i] = arr[j];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        String string= "ATBBTAXY";
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,0,2,1,0,1,2,1,0));
//        System.out.println(removeDups(string));
//        System.out.println(removeFirstDup(string));
        System.out.println(arrayList012(arr));
        Set<Integer> mySet = new HashSet<Integer>(arr);
        System.out.println(mySet);

        Set<Integer> mySet1 = new LinkedHashSet<Integer>(arr);
        arr.clear();
        arr.addAll(mySet);
        System.out.println(arr);

        String a = "X";
        String b = "X";
        System.out.println(a == b);

        String a1 = new String ("X");
        String b1 = new String ("X");
        System.out.println(a1 == b1);

        int [] arr1 = {2,3,4,4,8,8,8,11,11,11};
        System.out.println(Arrays.toString(uniqueElement1(arr1)));
    }
}
