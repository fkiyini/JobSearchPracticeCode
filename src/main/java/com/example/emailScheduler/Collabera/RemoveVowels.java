package com.example.emailScheduler.Collabera;

public class RemoveVowels {
    public static String aRemoveVowels(String str){
        String str1 = "";
        String vowels = "aeiouAEIOU";
        int i=0;
        while (i<str.length()){
           if(vowels.contains(""+str.charAt(i))){
               i++;
           }
           else {
               str1+=str.charAt(i);
               i++;
           }
        }
        return str1.toString();
    }
    public static boolean subString(int n,int k,String str1,String str2){
        String str ="";
        int i=0;
        while (i<n){
            if(str2.contains(""+str1.charAt(i)))
                str+=str1.charAt(i);
                i++;
        }
        System.out.println(str);
        return str.equals(str1)?true:false;
    }

    public static void main(String[] args) {
        String string = "E Hello";
        System.out.println(aRemoveVowels(string));
        System.out.println(subString(3,5,"abc","dabcd"));
    }
}
