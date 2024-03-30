package org.example.first;

import java.util.Arrays;

public class reverseLongInArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(159357L)));
        System.out.println(Arrays.toString(digitizeByStringBuilder(159357L)));
    }

    public static int[] digitize(long n) {
        String string = Long.toString(n);
        int[] arr = new int[string.length()];

        for(int i = 0; i < arr.length; i++){
            arr[i] = string.charAt(i) - '0';
        }

        for(int j = 0; j < arr.length / 2; j++){
            int temp = arr[j];
            arr[j] = arr[arr.length - j - 1];
            arr[arr.length - j - 1] = temp;
        }

        return arr;
    }

    public static int[] digitizeByStringBuilder(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
