package com.company;

import java.util.ArrayList;

public class Main {
    static int k = 10;
    static long[] array = new long[k];

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < k; i++){
            final int localI = i;
            Thread thread = new Thread(() -> work(localI));
            thread.start();
            threads.add(thread);
        }
        for (Thread t : threads) {
            t.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
        long res = 0;
        for (int i = 0; i < k; i++) {
            res += array[i];
        }
        System.out.println("total sum: " + res);
    }

    private static void work(int i) {
        long startTime = System.currentTimeMillis();
        long result = doHardWork(i * 1000, 100_000_000, i);
        long endTime = System.currentTimeMillis();
        System.out.println(i + ": " + result + " | " + (endTime-startTime));
    }

    private static long doHardWork(int start, int count, int numberOfThread) {
        long a = 0;
        long b = 0;
        for (int i = 0; i < count; i++) {
            a += (start + i) * (start + i) * Math.sqrt(start + i);
            b++;
        }
        array[numberOfThread] += b;
        return a;
    }
}
