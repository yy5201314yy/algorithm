package com.strin.recursive;

import java.util.Random;

/**
 * @author strin
 * @date 2021/5/17-13:58
 * 找出一个数组的某一范围的最大值
 */
public class MaxValue {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        maxValue(arr, 0, arr.length - 1);
    }

    public static int maxValue(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid=left+((right-left)>>1);
        int leftMax = maxValue(arr, left, mid);
        int rightMax = maxValue(arr, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }
}
