package org.example.first;

import java.util.Arrays;
import java.util.Objects;

public class StreamArraySum {
    public static void main(String[] args) {

        double[] doubles = {1.2, 0, -2, 3.8};

        System.out.println(sum(doubles));


    }

    public static double sum(double[] numbers) {

        if(Objects.isNull(numbers) || numbers.length == 0) {
            return 0;
        }

        return Arrays.stream(numbers).sum();
    }

}
