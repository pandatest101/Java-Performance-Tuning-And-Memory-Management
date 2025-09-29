package com.art.execution.engine;

public class Main {
    public static void main(String[] args) {
        int iterations = 100;
        int matrixSize = 100;

        MatrixMultiplication matrix = new MatrixMultiplication();
        double[][] a = matrix.createMatrix(matrixSize);
        double[][] b = matrix.createMatrix(matrixSize);

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