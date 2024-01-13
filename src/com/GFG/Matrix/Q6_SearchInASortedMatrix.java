package com.GFG.Matrix;

public class Q6_SearchInASortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        int x = 35;
        searchMatrix(matrix, x);
    }

    public static void searchMatrix(int[][] matrix, int x) {
        int i = 0, j = matrix[0].length-1;
        while (i < matrix.length && j > -1) {
            if(matrix[i][j] == x) {
                System.out.println("(" + i + "," + j + ")");
                return;
            }

            if(matrix[i][j]>x){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Not Found");
    }
}
