package com.example.emailScheduler.GoldManPrt5;

import java.util.ArrayList;
import java.util.List;

public class ReverseSentence {
    public static String isReverseSentence(String strings){
        List list= new ArrayList();
        int i=0;
//        String str = "";
        while (i<strings.length()){
            String str = "";
//            if (strings.charAt(i) != ' '){
//                i++;
//            }
//            else {
//                str+=strings.charAt(i);
//                i++;
//            }
            while(i<strings.length()  && strings.charAt(i) != ' '){
                str+=strings.charAt(i);
                i++;
            }
            i++;
            list.add(str);
        }
        System.out.println(list);
        String reversedSentence = "";
        for (int j = list.size()-1;j>=0;j--){
            reversedSentence+= " " + list.get(j);
        }
        return reversedSentence;
    }
    public static void main(String[] args) {
//        System.out.println(isReverseSentence("getting good at coding needs a lot of practice"));
        System.out.println(isReverseSentence("get and go"));
    }
}
