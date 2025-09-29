package com.art.execution.engine;

public class Main {
    public static void main(String[] args) {
        int iterations = 1;
        int matrixSize = 5;

        MatrixMultiplication matrix = new MatrixMultiplication();
        double[][] a = matrix.createMatrix(matrixSize);
        double[][] b = matrix.createMatrix(matrixSize);
        System.out.println("Matrix a:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%.2f ", a[i][j]);
            }
            System.out.println();
        }

        long startTime = System.nanoTime();
        for (int i = 1; i <= iterations; i++) {
            matrix.multiplyMatrices(a, b);
        }
        long endTime = System.nanoTime();
        long durationInNanos = endTime - startTime;
        double durationInSeconds = durationInNanos / 1_000_000.0;
        System.out.printf("Time taken: %.4f milliseconds%n", durationInSeconds);

        System.out.println("finished.");
    }
}