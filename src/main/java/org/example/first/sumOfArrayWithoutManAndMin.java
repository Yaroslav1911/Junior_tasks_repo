package org.example.first;

import java.util.Arrays;

public class sumOfArrayWithoutManAndMin {

    public static void main(String[] args) {


        int[] numbers = {10, 6, 2, 1, 1, 8, 10};

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min){
                numbers[i] = 0;
                break;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max){
                numbers[i] = 0;
                break;
            }
        }

        System.out.println(Arrays.stream(numbers).sum());
    }
}
