package org.example.first;

import java.util.Arrays;

public class averageOfArray {
    public static void main(String[] args) {

        int[] array1 = {1, 1, 1};
        int[] array2 = {1, 2, 3};

        System.out.println(find_average(array1));
        System.out.println(find_average(array2));

        System.out.println(find_averageByStream(array1));
        System.out.println(find_averageByStream(array2));

    }

    public static double find_averageByStream(int[] array){
        return Arrays.stream(array).average().orElse(0);
    }
    public static double find_average(int[] array){
        if(array == null || array.length == 0){
            return 0;
        }

        double sum = 0;
        for(int val : array) {
            sum += val;
        }

        return sum/(array.length);
    }
}
