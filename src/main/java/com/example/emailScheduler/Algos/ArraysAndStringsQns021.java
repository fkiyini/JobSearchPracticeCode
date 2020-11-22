package com.example.emailScheduler.Algos;

public class ArraysAndStringsQns021 {
    public static int checkPermutation(String str1 , String str2){

        if(str1.length()!=str2.length())return 0;
        else {
            for (int i = 0,j=str1.length()-1;i<str1.length();i++,j--){
                if(str1.charAt(i)!=str2.charAt(j)){
                    return 0;
                }
            }
        }

        return 1;
    }
    public static void main(String[] args) {
        System.out.println(checkPermutation("dog ","god"));
    }
}
