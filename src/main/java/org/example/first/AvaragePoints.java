package org.example.first;

import java.util.Arrays;

public class AvaragePoints {
    public static void main(String[] args) {
        int[] points = {12, 23, 34, 45, 56, 67, 78, 89, 90};
        System.out.println(betterThanAverage(points, 69));
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = Arrays.stream(classPoints).sum() + yourPoints;
        return sum / classPoints.length + 1 < yourPoints;
    }
}
