package com.olapie.homework.queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class QueuesDemo {

    public static void priorityQueue() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        PriorityQueue<Integer> reversedQueue = new PriorityQueue<>((a, b) -> b - a);
        int[] nums = new int[]{1, 2, 3, 4, 10, 9, 8, 5, 12};
        for (int num: nums) {
            queue.offer(num);
            reversedQueue.offer(num);
        }
        var it = queue.iterator();
        var nums1 = new ArrayList<Integer>();
        while (it.hasNext()) {
            nums1.add(it.next());
        }

        var nums2 = new ArrayList<Integer>();
        while (true) {
            var v = queue.poll();
            if (v == null) {
                break;
            }
            nums2.add(v);
        }

        System.out.println(nums1);
        System.out.println(nums2);
        var nums3 = new ArrayList<Integer>();
        while (true) {
            var v = reversedQueue.poll();
            if (v == null) {
                break;
            }
            nums3.add(v);
        }


        System.out.println(nums3);
    }
}
