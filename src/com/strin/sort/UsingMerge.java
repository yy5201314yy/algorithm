package com.strin.sort;

/**
 * @author strin
 * @date 2021/5/17-16:30
 * 小和问题
 */
public class UsingMerge {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5};
        System.out.println(subMerge(arr, 0, arr.length - 1));

    }

    public static int subMerge(int[] arr, int left, int right) {
        if (left == right) {
            return 0;
        }
        int mid = left + ((right - left) >> 1);
        return subMerge(arr, left, mid) + subMerge(arr, mid + 1, right) + endMerge(arr, left, mid, right);
    }

    public static int endMerge(int[] arr, int left, int mid, int right) {
        int p1=left;
        int p2=right;
        int i=0;
        int res=0;
        int[] auxiliary = new int[right - left + 1];
        while (p1 <= mid && p2 <= right) {
            res+=arr[p1]<arr[p2]?(right-p2+1)*arr[p1]:0;
            auxiliary[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
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
        return res;

    }
}
