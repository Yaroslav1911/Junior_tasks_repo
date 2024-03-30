package org.example.multithreading.sortingthreads;

public enum ForArrayPreparing {

    NUM_OF_ELEMENTS(100_000),
    BOUND_FOR_RANDOM(100000);

    private final int num;
    ForArrayPreparing(int n) {
        num = n;
    }

    public int getNum() {
        return num;
    }
}
