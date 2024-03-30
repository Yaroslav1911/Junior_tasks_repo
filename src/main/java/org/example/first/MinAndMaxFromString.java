package org.example.first;

import java.util.Arrays;        //for casual method

import static java.util.Arrays.stream;      //for clever method

public class MinAndMaxFromString {
    public static void main(String[] args) {

        String nums = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        System.out.println(highAndLow(nums) + "\n");
        System.out.println(highAndLowClever(nums));
    }

    static String highAndLowClever(String numbers) {
        var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return stats.getMax() + " " + stats.getMin();
    }
    public static String highAndLow(String numbers) {
        int min = stream(numbers.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
        int max = stream(numbers.split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
        return max + " " + min;
    }
}
