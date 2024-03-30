package org.example.multithreading.sortingthreads;

public class Multithreading {
    public static void main(String[] args) {

        SelectionSortThread selectionThread = new SelectionSortThread();
        InsertionSortThread insertionThread = new InsertionSortThread();
        BubbleSortThread bubbleThread = new BubbleSortThread();
        QuickSortThread quickThread = new QuickSortThread();

        selectionThread.start();      //defeated by 250000 elements in array
        insertionThread.start();      //defeated by 700000 elements in array
        bubbleThread.start();         //defeated by 100000 elements in array
        quickThread.start();          //defeated by 50000000 elements in array

    }
}
