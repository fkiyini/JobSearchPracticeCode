package com.example.emailScheduler.Algos.RevisionWeek1017082020;

public class StringComparision {
    public static String stringComparision(String str){

        String str1 = "";
        int i = 0, count = 1;
        while(i<str.length()-1){
            if(str.charAt(i)!=str.charAt(i+1)){
                i++;
            }
            while (i+1<str.length()&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            str1 = str1 + str.charAt(i)+count;
            count=1;
        }
        return str1;
    }

    public static void main(String[] args) {
        System.out.println(stringComparision("aabcccccaaa"));
    }

}
