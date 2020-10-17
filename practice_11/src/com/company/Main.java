package com.company;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static int sum;
    static ReentrantLock lock = new ReentrantLock();
    static AtomicInteger sumAtomic = new AtomicInteger();
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> threads = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
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
        System.out.println("sum = " + sum);
        //System.out.println("sum = " + sumAtomic);
    }

    private static void work(int i) {
        long startTime = System.currentTimeMillis();
        long result = mathOperations(i * 1000, 100_000_000);
        long endTime = System.currentTimeMillis();
        System.out.println("thread " + i + ": result=" + result + " | time=" + (endTime-startTime));
    }

    private synchronized static long mathOperations(int start, int count) {
        long a = 0;
        //lock.lock();
        for (int i = 0; i < count; i++) {
            a += (start + i) * Math.abs(start - i) / Math.sqrt(start + i);
            sum++;
            //sumAtomic.incrementAndGet();
        }
        //lock.unlock();
        return a;
    }
}
