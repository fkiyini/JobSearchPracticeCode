package com.example.emailScheduler.Algos;

public class ArraysAndStringsQns011 {

    public static int isUnique(String str){
        for (int i = 0; i<str.length()-1;i++){
           String temp = ""+str.charAt(i);
           if (str.substring(i+1,str.length()-1).contains(temp)){
               return 0;
           }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(isUnique("hello"));
    }
}
