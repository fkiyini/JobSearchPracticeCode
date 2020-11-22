package com.example.emailScheduler.Algos.GoldManPrt3;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public static String reverseString(String string){
        int i=0;
        List <String>stringList = new ArrayList<>();
        while(i<string.length()){
            String str = "";
            while (i<string.length() && string.charAt(i) != ' '){
                str = str+string.charAt(i);
                i++;
            }
            stringList.add(str);
            i++;
        }
        String str1 = " ";
        for (int j = stringList.size()-1; j>=0;j--){
            str1 += " " + stringList.get(j);
        }
        return str1;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("getting good at coding needs a lot of practice"));
    }
}
