package com.example.emailScheduler.Algos;

public class SamKiteStringCurlyRecFinal {

    public static String samKiteStringCurlyRecFinal(String str) {
        if (str == "") return str;
        else if (str.charAt(0) == '{') {
            if (str.charAt(str.length() - 1) == '}')
                return str;
            else
                return samKiteStringCurlyRecFinal(str.substring(0, str.length() - 1));
        }
        return samKiteStringCurlyRecFinal(str.substring(1));
    }


    // Java program to print all the permutations
// of the given string
//    public class GFG {

    // Function to print all the permutations of str
    static void printPermutn(String str, String ans) {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recurvise call
            printPermutn(ros, ans + ch);
        }
    }

//        // Driver code
//        public static void main(String[] args)
//        {
//            String s = "abb";
//            printPermutn(s, "");
//        }
//    }

    public static void main(String[] args) {
        String string = "abx{yei}t";
        System.out.println(string.substring(0, string.length() - 1));
        System.out.println(samKiteStringCurlyRecFinal(string));
        String s = "abc";
        printPermutn(s, "");
    }
}
