package com.bridgelabz.algorithm;

import java.util.Arrays;

public class BubbleSort {
    static int[] bubbleSort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        return array;
    }

    public static void main(String args[]) {

        int[] data = { 7, 2, 15, -1, 11 };

        int[] sortedArray=bubbleSort(data);

        System.out.println("Elements in Ascending Order:");
        System.out.println(Arrays.toString(sortedArray));
    }
}
