package com.example.emailScheduler.GoldManPrt5;

public class PascalsTriangle {
    public static int isPascalsTriangleCod(int row, int col){
        if (row<col) return 0;
        else if(col == 0  || col == row) return 1;
            return isPascalsTriangleCod(row-1,col-1) + isPascalsTriangleCod(row-1, col);
    }

    public static void main(String[] args) {
        System.out.println(isPascalsTriangleCod(2,5));
    }
}
