package com.strin.sort;

import java.util.Random;

public class SelectSort {
    public static void main(String[] args) {
        int[] list = new int[20];
        Random random = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(100);
        }

        selectedSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
    public static void selectedSort(int[] list){
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.length-1 ; i++) {
            int minIndex=i;
            for (int j = i+1; j < list.length; j++) {
                minIndex=list[minIndex]<list[j]?minIndex:j;
            }
            swap(list,i, minIndex);
        }
    }
    public static void swap(int[]arr,int first, int second) {
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
