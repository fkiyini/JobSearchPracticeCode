package com.example.emailScheduler.Algos;

public class ArraysAndStringsQns030 {
    public static String urlIfy(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        int index = str.length() + count * 2;
        char[] str1 = new char[index];
        if (index == str.length()) return str;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                str1[index - 1] = '0';
                str1[index - 2] = '2';
                str1[index - 3] = '%';
                index = index - 3;
            }
            else {
                str1[index-1] = str.charAt(i);
                index -- ;
            }
        }
        return new String(str1);
    }

    public static void main(String[] args) {
        System.out.println(urlIfy("Mr John Smith"));
    }
}
