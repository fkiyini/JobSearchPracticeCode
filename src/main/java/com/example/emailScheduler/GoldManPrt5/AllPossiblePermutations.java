package com.example.emailScheduler.GoldManPrt5;

import java.util.ArrayList;
import java.util.List;

public class AllPossiblePermutations {
    public static void allPossiblePermutations(String s, String ans) {
        if (s.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String ros = s.substring(0, i) + s.substring(i + 1);
            allPossiblePermutations(ros, ans + ch);
        }
    }
    public static void helperFunction(String str) {
        String string = " ";
        allPossiblePermutations(str, string);
    }
    public static void main(String[] args) {
        helperFunction("abc");
        SumString sumString = new SumString();
        System.out.println();
        System.out.println(sumString.generate(3));
        System.out.println(sumString.generate1(3));
        System.out.println(sumString.generate2(3));
    }

}
