package com.example.emailScheduler.Algos.GoldMan;
import java.util.Arrays;
public class MissingNRepeated {
    public static char [] missingNRepeated(int[] arr) {
        int i = 0;
        String str = "";
        Arrays.sort(arr);
        while (i < arr.length - 1) {
            if (arr[i] == arr[i + 1]) {
                str += arr[1];
            } else if (arr[i + 1] - arr[i] == 2) {
                int num = arr[i] + 1;
                str += num;
            }
            i++;
        }

        char [] fin = str.toCharArray();
        return fin;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        System.out.println(Arrays.toString(missingNRepeated(arr)));
    }
}
