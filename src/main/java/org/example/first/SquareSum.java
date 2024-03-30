package org.example.first;

import java.util.Arrays;

public class SquareSum {
    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{1, 2, 2}));
        System.out.println(squareSum(new int[] {1,2}));
    }

    public static int squareSum(int[] n) {

        return Arrays.stream(n).map(e -> e*e).sum();

    }
}
