package com.example.emailScheduler.Algos;

public class GliderLusam1 {

    public static char palindrome(int n , String str){
        int j = n-1,k=0;
        if(1>n||n>100){
            return '0';
        }
        else if(n==2){
            return '0';
        }
        else {
            for (int i=0;i<str.length();i++,j--){
                if(str.charAt(i) == str.charAt(j) && i>n/2){
                    k++;
//                    int a = getCharNumber(str.charAt(i));
                }
                else if(str.charAt(i) != str.charAt(j) && j == n/2){
                    return str.charAt(i)>str.charAt(j)? str.charAt(j):str.charAt(i);
                }
//                else if(i == n/2)
//                    return str.charAt(i);
            }
        }

        return '0';
    }

    public static void main(String[] args) {
        System.out.println(palindrome(3,"aca"));
    }
}
