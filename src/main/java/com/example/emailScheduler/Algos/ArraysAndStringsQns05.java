package com.example.emailScheduler.Algos;

public class ArraysAndStringsQns05 {

    public static int oneWay(String str1, String str2){
        int count = 0, i=0,j=0;
        if(str1.length() == str2.length()){
            while (i<=str1.length()-1){
                if (str1.charAt(i)!=str2.charAt(i)){
                    i++; count++;
                    if(count > 1){
                        return 0;
                    }
                }
            }
        }
        else if (str1.length()-str2.length() == 1 || str2.length()-str1.length() == 1){
            if(str1.length()>str2.length()){
                while (i<str1.length() && j<str2.length()){
                    if(str1.charAt(i) == str2.charAt(j)){
                        i++;j++;
//                        if(count == 0 && (j== str2.length())){
//                            return 1;
//                        }
                    }
                    else {
                        i++;
                        if(str1.charAt(i) == str2.charAt(j)){
                            i++;j++;count++;
                            if(count>1){
                                return 0;
                            }
                        }
                    }
                }
                if(count == 1) return 1;
                else return 0;
            }
            else if(str1.length()<str2.length()){
                while (i<str2.length() && j<str1.length()){
                    if(str2.charAt(i) == str1.charAt(j)){
                        i++;j++;
//                        if(count == 0 && (j == str1.length())){
//                            return 1;
//                        }
                    }
                    else {
                        i++;
                        if(str2.charAt(i) == str1.charAt(j)){
                            i++;j++;count++;
                            if(count>1){
                                return 0;
                            }
                        }
                    }
                }
                if(count == 1) return 1;
                else return 0;
            }
        }
        return 0;
    }

        public static void main(String[] args) {
        String s1 = "pale";
        String s2 = "bale";

        System.out.println(oneWay(s1, s2));
    }

}
