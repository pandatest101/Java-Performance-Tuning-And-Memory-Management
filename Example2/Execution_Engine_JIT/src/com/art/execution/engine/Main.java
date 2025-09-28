package com.art.execution.engine;

public class Main {
    public static void main(String[] args) {

        int iterations = 100;
        int matrixSize = 500;

        MatrixMultiplication matrix = new MatrixMultiplication();
        double[][] a = matrix.createMatrix(matrixSize);
        double[][] b = matrix.createMatrix(matrixSize);

        for (int i = 1; i <= iterations; i++) {
            long startTime = System.nanoTime();
            matrix.multiplyMatrices(a, b);
            long endTime = System.nanoTime();
            long durationInNanos = endTime - startTime;
            double durationInSeconds = durationInNanos / 1_000_000.0;
            System.out.printf("loop %d ,Time taken: %.4f milliseconds%n",i, durationInSeconds);
        }

        System.out.println("finished.");
    }

}