package com.example.emailScheduler.GoldManPrt5;

import java.util.Arrays;
public class OptimalPathProblem {
        public static void main(String[] args) {
            int[][] test = new int[][] {{0,0,0,0,5}, {0,1,1,1,0}, {2,0,0,0,0}};
            System.out.println(gridProblem(test));
        }
        public static int gridProblem(int[][]inputGrid){
            int [][] grid = new int[inputGrid.length][inputGrid[0].length];
            int m = 0;
            for(int k = inputGrid.length -1; k > -1; k--){
                grid[m] = inputGrid[k];
                m++;
            }
            int [][] dp = new int[grid.length][grid[0].length];
            //dp[0][0] = grid[0][0];
            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid[0].length; j++){
                    if(j > 0 && i> 0) {
                        //System.out.println(Math.max(dp[i - 1][j], dp[i][j - 1]));
                        dp[i][j] = grid[i][j] + Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                    if(i == 0 && j > 0){
                        dp[i][j] = grid[i][j] + dp[i][j - 1];
                    }
                    if(j==0 && i > 0){
                        dp[i][j] = grid[i][j] + dp[i - 1][j];
                    }
                    if(i==0 && j==0){
                        dp[i][j] = grid[i][j];
                    }
                }
            }
            for(int [] arr : dp) {
                System.out.println(Arrays.toString(arr));
            }
            return dp[inputGrid.length-1][inputGrid[0].length-1];
        }
}


