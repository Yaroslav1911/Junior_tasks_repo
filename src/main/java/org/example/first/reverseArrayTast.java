package org.example.first;

import java.util.Arrays;

public class reverseArrayTast {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 23, 441, 1, 223, 44, 0};

        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse (int[] numbers) {
        for (int i = 0; i < numbers.length/2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
    }

}
