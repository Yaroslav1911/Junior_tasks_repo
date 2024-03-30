package org.example.first;

import java.util.Arrays;

public class fakeBin {
    public static void main(String[] args) {
        System.out.println(fakeBinary("4822673"));
    }

    public static String fakeBinary(String numberString) {
        String new1 = numberString.replaceAll("[0-4]","0");
        return new1.replaceAll("[5-9]","1");
    }
}
