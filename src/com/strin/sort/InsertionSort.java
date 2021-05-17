package com.strin.sort;

import java.util.Random;

/**
 * @author youyouInMe
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] list = new int[1];
        Random random = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(100);
        }
        insertionSort(list);
        for (int listOfNumber : list) {
            System.out.println(listOfNumber);
        }
    }

    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentIndex=i;
            for (int j = i; j > 0 && list[currentIndex]<list[j-1] ; j--) {
                int temp = list[currentIndex];
                list[currentIndex] = list[j - 1];
                list[j-1]=temp;
                currentIndex=j-1;
            }
        }
    }
}
