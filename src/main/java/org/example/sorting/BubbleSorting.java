package org.example.sorting;

import java.util.Arrays;

public class BubbleSorting extends RandomArray{
    public static void main(String[] args) {
        int[] arr = getRandomArray(20, 10000);

        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        boolean stillHave = true;

        while (stillHave) {

            stillHave = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    stillHave = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
