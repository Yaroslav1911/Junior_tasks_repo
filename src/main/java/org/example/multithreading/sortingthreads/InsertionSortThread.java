package org.example.multithreading.sortingthreads;

import org.example.sorting.InsertionSorting;

import java.util.Random;

public class InsertionSortThread extends Thread{
    private int[] prepareArray() {
        int[] array = new int[ForArrayPreparing.NUM_OF_ELEMENTS.getNum()];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(ForArrayPreparing.BOUND_FOR_RANDOM.getNum());
        }
        return array;
    }

    @Override
    public void run() {
        int[] array = prepareArray();
        InsertionSorting.insertionSort(array);
        System.out.println("InsertionSorting complete!");
    }
}
