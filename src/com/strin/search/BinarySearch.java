package com.strin.search;

/**
 * @author strin
 * @date 2021/5/16-20:05
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(arr, 0));
        System.out.println("-------------------------");
        System.out.println(binarySearch(arr, 1));
        System.out.println("-------------------------");
        System.out.println(binarySearch(arr, 2));
        System.out.println("-------------------------");
        System.out.println(binarySearch(arr, 3));
        System.out.println("-------------------------");
        System.out.println(binarySearch(arr, 4));
        System.out.println("-------------------------");
        System.out.println(binarySearch(arr, 5));
        System.out.println("-------------------------");
        System.out.println(binarySearch(arr, 6));
        System.out.println("-------------------------");
        System.out.println(binarySearch(arr, 7));
        System.out.println("-------------------------");
        System.out.println(binarySearch(arr, 8));
        System.out.println("-------------------------");
        System.out.println(binarySearch(arr, 9));
        System.out.println("-------------------------");
        System.out.println(binarySearch(arr, 10));
        System.out.println("-------------------------");
        System.out.println(binarySearch(arr, 11));

    }

    public static boolean binarySearch(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        while(left<=right) {
            int middle=(left+right)/2;
            if (target > arr[middle]) {
                left = middle+1 ;
            } else if (target < arr[middle]) {
                right = middle-1 ;
            } else {
                return true;
            }
        }
        return false;
    }
}
