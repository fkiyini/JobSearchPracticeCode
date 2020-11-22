package com.example.emailScheduler.Algos.GoldManPrt2;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatingChar {
    public static String nonRepeatingChar(String str){
        String str1 = "";
        Set set = new HashSet();
        for(int i = 0;i<str.length();i++){
            if(!set.add(str.charAt(i))){
                str1+=str.charAt(i);
            }
        }
        for(int i=0;i<str.length();i++){
            if(!str1.contains(str.charAt(i)+"")){
                return str.charAt(i)+"";
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "racecar ";
        System.out.println(nonRepeatingChar(str));
    }
}
