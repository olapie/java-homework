package com.olapie.homework.executorservice;

import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void run() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
       // BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10, true);
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        executorService.submit(producer);
        for (int i = 0; i < 3; i++) {
            Consumer consumer = new Consumer(queue, i+1);
            executorService.submit(consumer);
        }
        executorService.shutdown();
        var result = executorService.awaitTermination(20, TimeUnit.SECONDS);
        System.out.println("done: "+result);
    }
}
