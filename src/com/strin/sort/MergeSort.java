package com.strin.sort;

import java.util.Random;

/**
 * @author strin
 * @date 2021/5/17-15:24
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        subMergeSort(arr,0,arr.length-1);
        for (int member : arr) {
            System.out.println(member);
        }

    }

    public static void subMergeSort(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        subMergeSort(arr, left, mid);
        subMergeSort(arr, mid + 1, right);
        endMergeSort(arr,left,mid,right);
    }

    public static void endMergeSort(int[]arr,int left,int mid,int right) {

        int p1=left;
        int p2=mid+1;
        int i=0;
        int[] auxiliary = new int[right - left + 1];
        while (p1 <= mid && p2 <= right) {
            auxiliary[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid) {
            auxiliary[i++] = arr[p1++];
        }
        while (p2 <= right) {
            auxiliary[i++] = arr[p2++];
        }
        for (int j = 0; j < auxiliary.length; j++) {
            arr[left+j] = auxiliary[j];
        }
    }

}
