package org.example.sorting;

import java.util.Arrays;

public class SelectionSorting extends RandomArray{
    public static void main(String[] args) {
        int[] arr = getRandomArray(20, 10000);

        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    public static void selectionSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int min = arr[i];
            int indexOfMin = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexOfMin = j;
                }
            }
            swap(arr, i, indexOfMin);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
