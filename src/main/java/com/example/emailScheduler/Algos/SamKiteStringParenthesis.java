package com.example.emailScheduler.Algos;

public class SamKiteStringParenthesis {

    public static String  valuesInParenthesis(String str){
        String str1 = "";
        int k = 0;
        boolean isFound = false;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '{'){
                i++;
                k=i;
                break;
            }
        }
        System.out.println(str);
        System.out.println(k);
        while(k<str.length()){
            if(str.charAt(k) =='}' ){
                return str1;
            }
            else if (str.charAt(k) !='}' && k == str.length()-1){
                return " Not Possible";
            }
            else if (k<str.length())str1 = str1+str.charAt(k);
            k++;
        }
        return str1;
    }

    public static void main(String[] args) {
        System.out.println(valuesInParenthesis("abx{yei}t"));
    }
}
