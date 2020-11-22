package com.example.emailScheduler.Algos.GoldMan.Comparator;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorQuestion2 {
    public static String largestNumber(int[] nums) {
        // Get input integers as strings.
        String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
        }
        // Sort strings according to custom comparator.
        Arrays.sort(asStrs, new LargerNumberComparator());
        // If, after being sorted, the largest number is `0`, the entire number
        // is zero.
        if (asStrs[0].equals("0")) {
            return "0";
        }
//        char [] letters = {'q','w'};
//        System.out.println(new String(letters));
        // Build largest number from sorted array.
        String largestNumberStr = new String();
        for (String numAsStr : asStrs) {
            largestNumberStr += numAsStr;
        }
        return largestNumberStr;
    }
    public static void main(String[] args) {
//        List list = Arrays.asList(1, 34, 3, 98, 9, 76, 45, 4);
        int[] list = {1, 34, 3, 98, 9, 76, 45, 4};
        System.out.println(largestNumber(list));
    }
    private static class LargerNumberComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        }
    }
}



