package org.example.sorting;

public class SortSpeedTesting extends RandomArray{
    public static void main(String[] args) {
        int[] array = getRandomArray(200000, 100000);
        int[] selectionArray = new int[array.length],
                insertionArray = new int[array.length],
                bubbleArray = new int[array.length],
                quickArray = new int[array.length];
        makeACopy(array, selectionArray, insertionArray, bubbleArray, quickArray);


        long startSelection = System.currentTimeMillis();
        SelectionSorting.selectionSort(selectionArray);
        long endSelection = System.currentTimeMillis();
        System.out.println("It need " + ((endSelection - startSelection) / 1000) + " sec - Selection");

        long startInsertion = System.currentTimeMillis();
        InsertionSorting.insertionSort(insertionArray);
        long endInsertion = System.currentTimeMillis();
        System.out.println("It need " + ((endInsertion - startInsertion) / 1000) + " sec - Insertion");

        long startBubble = System.currentTimeMillis();
        BubbleSorting.bubbleSort(bubbleArray);
        long endBubble = System.currentTimeMillis();
        System.out.println("It need " + ((endBubble - startBubble) / 1000) + " sec - Bubble");

        long startQuick = System.currentTimeMillis();
        QuickSorting.quickSort(quickArray);
        long endQuick = System.currentTimeMillis();
        System.out.println("It need " + ((endQuick - startQuick) / 1000) + " sec - Quick");


    }

    private static void makeACopy(int[] array, int[] selectionArray, int[] insertionArray, int[] bubbleArray, int[] quickArray) {
        System.arraycopy(array, 0, selectionArray, 0, array.length);
        System.arraycopy(array, 0, insertionArray, 0, array.length);
        System.arraycopy(array, 0, bubbleArray, 0, array.length);
        System.arraycopy(array, 0, quickArray, 0, array.length);
    }

}
