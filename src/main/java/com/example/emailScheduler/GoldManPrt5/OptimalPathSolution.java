package com.example.emailScheduler.GoldManPrt5;

public class OptimalPathSolution {

    public static int optimalPathSolution(int[][]grid){
        int row=grid.length; int column=grid[0].length;
        int[][]p = new int[row][column];
        p[row-1][0] = grid[row-1][0];

        for(int i=1;i<column;i++){
            p[row-1][i] = grid[row-1][i]+p[row-1][i-1];
        }
        for(int j=row-2;j>=0;j--){
            p[j][0]=grid[j][0]+p[j+1][0];
        }

        for(int i=row-2;i>=0;i--){
            for(int j=1;j<column;j++){
                p[i][j]=grid[i][j]+Math.max(p[i+1][j],p[i][j-1]);
            }
        }
     return p[0][column-1];
    }
    public static void main(String[] args) {
        int[][] test = new int[][] {{2,0,0,0,5}, {0,1,1,1,0}, {2,0,0,0,0}};
        System.out.println(optimalPathSolution2(test));
    }

    public static int optimalPathSolution2(int [][] grid){
        int row = grid.length; int col = grid[0].length;
        int [][] finalArray = new int[row][col];
        finalArray[row-1][0] = grid[row-1][0];

        for (int i=1;i<col;i++){
            finalArray[row-1][i] = grid[row-1][i]+finalArray[row-1][i-1];
        }
        for (int i=row-2;i>=0;i--){
            finalArray[i][0] = grid[i][0]+finalArray[i+1][0];
        }
        for (int i=row-2;i>=0;i--){
            for (int j=1;j<col;j++){
                finalArray[i][j] = grid[i][j] + Math.max(finalArray[i+1][j], finalArray[i][j-1]);
            }
        }

        return finalArray[0][col-1];
    }

}
