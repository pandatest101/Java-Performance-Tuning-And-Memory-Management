package com.art.avoid.allocations;

public class Main {
    public static void main(String[] args) {

        StringConcat stringConcat = new StringConcat();

        long t0 = System.nanoTime();
        stringConcat.concatPlus(100_000);
//        stringConcat.concatBuilder(100_000);
        long t1 = System.nanoTime();
        System.out.println(" take time =" + ((t1 - t0) / 1_000_000) + " ms");
    }
}