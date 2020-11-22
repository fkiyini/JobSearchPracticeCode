package com.example.emailScheduler.GoldManPrt6;

import java.util.Arrays;

public class StockProfit {
    public static void main(String[] args) {
        int price[] = {100, 180, 260, 310,40, 535, 695};
        int price1[] = {100, 80, 10, 200,40, 535, 695};

//        int n = price.length;
//        System.out.print(maxProfit(price, 0, n - 1));
//        System.out.println(Arrays.toString(isStockProfit(price)));
        System.out.println(isStockProfit(price));
    }


    public static int isStockProfit(int[] array) {
        int min, max, i, len, j, finalValue;
        min = max = i = j = finalValue = 0;
        len = array.length;
        int finalArray[] = new int[len / 2 + 1];
        while (i < len) {
            min = finalArray[j++] = array[i];
            i++;
            while (i + 1 < len && array[i] < array[i + 1]) {
                i++;
            }
            max = finalArray[j++] = array[i];
//            finalValue = Math.max((max-min), finalValue);
            finalValue+= (max-min);

            i++;

        }
//        return finalArray;
        return finalValue;
    }
}
