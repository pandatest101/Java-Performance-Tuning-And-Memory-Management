package com.art.execution.engine;

public class MatrixMultiplication {

    public double[][] createMatrix(int size) {
        double[][] matrix = new double[size][size];
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                matrix[r][c] = r*c;
            }
        }
        return matrix;
    }

    public double[][] multiplyMatrices(double[][] a, double[][] b) {
        int size = a.length;
        double[][] result = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

}