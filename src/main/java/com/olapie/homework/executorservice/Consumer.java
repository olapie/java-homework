package com.olapie.homework.executorservice;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {
    private final int id;
    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue, int id) {
        this.queue = queue;
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            Integer num = null;
            try {
//                num = queue.take();
                num = queue.poll(3, TimeUnit.SECONDS);
                if (num == null) {
                    // timeout, no value available
                    break;
                }
                System.out.printf("consumer %d took num %d\n", id, num);
                var f = Math.random();
                var duration = 1000 * (1-f) + 5000*f;
                Thread.sleep((long) duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.printf("consumer %d done\n", id);
    }
}
