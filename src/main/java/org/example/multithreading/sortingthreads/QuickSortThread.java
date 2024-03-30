package org.example.multithreading.sortingthreads;

import org.example.sorting.QuickSorting;

import java.util.Random;

public class QuickSortThread extends Thread{
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
        QuickSorting.quickSort(array);
        System.out.println("QuickSorting complete!");
    }
}
