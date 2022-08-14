package com.bridgelabz.algorithm;

public class InsertionSort {
    public static String[] insertionSort(String[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            String key = array[i];
            int j = i-1;
            while ( (j >= 0) && ( array[j].compareTo(key)>0 ) ) {
                array [j+1] = array [j];
                j--;
            }
            array[j+1] = key;
        }
        return array;
    }

    public static void main(String a[]){
        String[] arr1 = {"banana","orange","apple","mango","grapes"};
        System.out.println("Before Insertion Sort");
        for(String i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        String[] sortedArray=insertionSort(arr1);

        System.out.println("After Insertion Sort");
        for(String i:sortedArray){
            System.out.print(i+" ");
        }
    }
}
