package com.olapie.homework.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        var a = new int[]{1, 3, 2, 5, 8, 9, 10, 2, 0, -1, 8};
        var previousSmallerIndex = solution(a);
        System.out.println(Arrays.toString(previousSmallerIndex));
    }

    public static int[] solution(int[] numbers) {
        var res = new int[numbers.length];
        res[0] = -1;
        Deque<Integer> deque = new ArrayDeque<>(res.length);
        deque.push(0);
        for (int i = 0; i < numbers.length; i++) {
            while(!deque.isEmpty() && numbers[deque.peek()] >= numbers[i]) {
                deque.pop();
            }

            if (!deque.isEmpty()) {
                res[i] = deque.peek();
            } else {
                res[i] = -1;
            }
            deque.push(i);
        }
        return res;
    }
}
