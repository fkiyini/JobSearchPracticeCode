package com.example.emailScheduler.Algos;

public class GliderLusam0 {

    public static void removeVowels(int n, String str) {
        String result ="-1";
        String str1 = "";
        int k = 0;
        boolean enter = false;
        String stringVowels = "'a','e','i','o','u','A','E','I','O','U'";
//        String stringVowels1 = "aeiou";
        if(1>n || n>100){
            System.out.println(result);
        }
        else {
//            System.out.println(stringVowels);
            for (int i = 0; i < str.length(); i++) {
                enter = true;
                String test = "" + str.charAt(i);
//            for (int j = 0; j < stringVowels1.length(); j++) {
//                if (str.charAt(i) == stringVowels1.charAt(j) || stringVowels1.contains(test)) {
                if (stringVowels.contains(test)) {
//                stringVowels.contains(str);
//                    k++;
                    enter = false;
                }
                else if (enter) {
//            else {
                    str1 = str1 + str.charAt(i);
//                    enter = false;
                }
            }
        }
        System.out.println(str1);
    }
    public static void main(String[] args) {
        String s = "Get over here";
//        System.out.println(removeVowels(s.length(),s));
            removeVowels(s.length(),s);
//        String str2 = "Kiyini";
//        String lastName = "";
//        for (int i = 0;i<str2.length();i++){
//            System.out.print(lastName = ""+str2.charAt(i));
//        }

    }
}
