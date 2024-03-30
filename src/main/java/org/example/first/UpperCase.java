package org.example.first;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
    }

    public static String toJadenCase(String phrase) {
        return Arrays.stream(phrase.split(" "))
                .map(s -> s.substring(0,1).toUpperCase().concat(s.substring(1)))
                .collect(Collectors.joining(" "));
    }
}
