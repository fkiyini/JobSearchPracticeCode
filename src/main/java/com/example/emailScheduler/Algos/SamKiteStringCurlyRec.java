package com.example.emailScheduler.Algos;

public class SamKiteStringCurlyRec {

    public static String samKiteStringCurlyRecZero(String str){
        int i = 0;
        return samKiteStringCurlyRecOne(str,i);
    }
    public static String samKiteStringCurlyRecOne(String str, int i){
        String str1 = "";
        if(str.charAt(i) == '{'&& str.length()-1>i){
            i=i+1;
            return samKiteStringCurlyRecTwo(str.substring(i,str.length()),i,str1);
        }
        else if ((str.charAt(i) != '{' && str.length()-1>i)) {
            return samKiteStringCurlyRecOne(str.substring(i+1,str.length()),i+1);
        }
        return str1;
    }
    public static String samKiteStringCurlyRecTwo(String str, int i,String str1){

//        if(str.charAt(i) !='{'&& str.charAt(i)!='}'&& str.length()>i){
        if(str.charAt(i)!='}'&& str.length()-1>i){
            str1 = str1 +str.charAt(i);
            i++;
            samKiteStringCurlyRecTwo(str.substring(i,str.length()),i,str1);
        }
//        else if(str.charAt(i) != '}' && str.length()== i)
        else if(str.charAt(i) == '}')
            return str1;
//        else if(str.charAt(i) == '}')
//            return str1;
        return str;
    }

    public static void main(String[] args) {
        System.out.println(samKiteStringCurlyRecZero("abx{yei}t"));
    }
}
