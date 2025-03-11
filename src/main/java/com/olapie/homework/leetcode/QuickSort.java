package com.olapie.homework.leetcode;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] nums) {
        System.out.println(Arrays.toString(nums));
        sort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int i = partition(nums, low, high);
        sort(nums, low, i-1);
        sort(nums, i+1, high);
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, high);
        return i;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }
}
