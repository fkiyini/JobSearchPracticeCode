package com.example.emailScheduler.Algos.RevisionWeek1017082020;

public class CheckPermutation {
    public static  boolean checkPermutation(String str1, String str2){
        int i = 0;
        if(str1.length() != str2.length()) return false;
        else if(str1.equals(str2)) return true;
        else if(!str1.equals(str2)){
            while (str1.length()>i){
                if (str1.contains(str2.charAt(i)+"") && str2.contains(str1.charAt(i)+"")){
                    i++;
                }
                else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPermutation("farouk","kroukf"));
    }
}
