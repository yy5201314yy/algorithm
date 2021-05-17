package com.strin.sort;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = new int[40];
        Random random = new Random(1);
        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(1000);
        }
        bubbledSort(list);
        for (int listOfNumber : list) {
            System.out.println(listOfNumber);
        }
    }

    public static void bubbledSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

}
