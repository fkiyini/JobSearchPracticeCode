package com.example.emailScheduler.Livia;


import java.util.Arrays;

public class Indice {
        static int[] a = new int[]{3, 5, 6, 8, 2};

        public static void main(String[] args) {
            int[] result = returnIndices(a, 9);
            System.out.println(Arrays.toString(result));
        }

        public static int[] returnIndices(int[] nums, int target) {
            for (int i = 0; i <= nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (target == nums[i] + nums[j]) {
                        return new int[]{i,j};
                    }

                }
            }
            return new int[]{};
        }

    }
