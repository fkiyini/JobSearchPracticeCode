package com.example.emailScheduler.Algos.KiteSpring;

public class isCurlyBraces {

    public static String curlyBraces(String str){
        if(str.charAt(0) == '{'){
            if(str.charAt(str.length()-1) == '}'){
                return str.substring(1,str.length()-1);
            }
            else
                return curlyBraces(str.substring(0,str.length()-1));
        }

        return curlyBraces(str.substring(1));
    }

    public static String theCurlyBraces(String str){
        if (str == "") return null;
        else if(str.charAt(0)=='{'){
            if (str.charAt(str.length())=='}'){
                return str;
            }
            else
                return theCurlyBraces(str.substring(0,str.length()-1));
        }
        return theCurlyBraces(str.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(curlyBraces("wiieo{hdjie}oii"));
    }
}
