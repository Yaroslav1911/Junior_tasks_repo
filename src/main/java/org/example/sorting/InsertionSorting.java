package org.example.sorting;

import java.util.Arrays;

public class InsertionSorting extends RandomArray{
    public static void main(String[] args) {
        int[] arr = getRandomArray(20, 10000);

        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];

            int j = i - 1;
            while (j >= 0 && arr[j] > currentValue) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentValue;
        }
    }
}
