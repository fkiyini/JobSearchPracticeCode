package com.example.emailScheduler.Algos.GoldManPrt2;

public class StringInCurlyBraces {
    public static String stringInCurlyBraces(String str){
        if(str == "") return "";
        else if(str.charAt(0) == '{'){
                if(str.charAt(str.length()-1) == '}')
                    return str.substring(1,str.length()-1);
                else
                    return stringInCurlyBraces(str.substring(0,str.length()-1));
        }
        return stringInCurlyBraces(str.substring(1));
    }
    public static void main(String[] args) {
        String string = "abx{yei}t";
        System.out.println(string.substring(0,string.length()-1));
        System.out.println(stringInCurlyBraces(string));
    }
}
