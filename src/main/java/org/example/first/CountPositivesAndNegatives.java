package org.example.first;

import java.util.Arrays;
import java.util.Objects;

public class CountPositivesAndNegatives {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 0, 0, -5, -9, -1};
        System.out.println(Arrays.toString(countPositivesSumNegatives(arr)));

    }

    public static int[] countPositivesSumNegatives(int[] input)
    {
        if(Objects.isNull(input) || input.length == 0){
            return null; //return an array with count of positives and sum of negatives
        }

        int positive = 0;
        int negative = 0;


        for (int j : input) {
            if (j > 0) {
                positive++;
            } else {
                negative += j;
            }
        }

        return new int[]{positive, negative};
    }
}
