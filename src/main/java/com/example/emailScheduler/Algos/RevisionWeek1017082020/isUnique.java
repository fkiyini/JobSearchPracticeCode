package com.example.emailScheduler.Algos.RevisionWeek1017082020;
import java.util.HashMap;
import java.util.Map;

public class isUnique {

    public static String pairs(Integer []arr,int k){
        String str = "";
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hashMap.put(arr[i],arr[i]);
           //hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> hM : hashMap.entrySet()){
            int sum = hM.getValue()+k;
            if(hashMap.containsKey(sum)){
                str = str + "("+sum+","+hM.getValue()+")";
            }

        }
//        for (int i=0;i<arr.length;i++){
//            int sum = hashMap.get(arr[i])+k;
//            if(hashMap.containsKey(sum)){
////                return "("+sum+","+hashMap.get(arr[i])+")";
//                str = str + "("+sum+","+hashMap.get(arr[i])+")";
//            }
//        }
        return str;
    }

    public static boolean isUni(String str){
        String str1 = "";
        boolean [] char_set = new boolean[128];
        int [] letters  = new int[128];
        System.out.println(letters[str.charAt(1)]);
        System.out.println(char_set[str.charAt(0)]);
        while (str.length()>0){
            int i=0;
            System.out.println(str1);
            if(str1.contains(str.charAt(i)+"")){
                return false;
            }
            else {
                str1 = str1+str.charAt(i);
                i++;
                str = str.substring(i,str.length());
                System.out.println(str);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUni("kiynt"));
        Integer [] arr = {1,1,2,2,3,3};
        System.out.println(pairs(arr,1));
    }
}
