package org.example.sorting;

import java.util.Random;

public class RandomArray {
    public static int[] getRandomArray(int arrayLength, int randomBound) {
        Random rnd = new Random();
        int[] arr = new int[arrayLength];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(randomBound);
        }
        return arr;
    }
}
