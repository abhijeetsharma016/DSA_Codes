package com.GFG.Matrix;

public class Q3_TransposeOfAMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        transpose(matrix);
    }

    public static void transpose(int[][] matrix) {
        int R = matrix.length, C = R;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("\n\n\n");
        for (int i = 0; i < R; i++) {
            for (int j = i+1; j < C; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
