package org.example.second;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToByte {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
        System.out.println(convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 1, 0))));
        System.out.println(convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 0, 1))));
        System.out.println(convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1))));
        System.out.println(convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 1, 1, 1, 1, 1))));
    }

    public static int convertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }
}
