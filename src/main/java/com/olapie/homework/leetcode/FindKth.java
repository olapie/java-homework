package com.olapie.homework.leetcode;

public class FindKth {
    public static void main(String[] args) {
        var a = new int[]{1, 2, 3, 0, -1, 9};
        System.out.println(find(a, 3));
    }

    static int find(int[] a, int k) {
        return find(a, 0, a.length, k);
    }

    static int find(int[] a, int start, int end, int k) {
        var i = partition(a, start, end);
        System.out.printf("%d, %d, %d\n", start, end, i);
        if (i == k) {
            return a[i];
        }

        if (i > k) {
            return find(a, start, i, k);
        }

        return find(a, i+1, end, k);
    }

    static int partition(int[] a, int start, int end) {
        int pivot = a[end - 1];
        int i = start;
        for (int j = start; j < end; j++) {
            if (a[j] < pivot) {
                swap(a, i++, j);
            }
        }
        swap(a, i, end - 1);
        return i;
    }

    static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
