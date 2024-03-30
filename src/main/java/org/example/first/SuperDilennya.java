package org.example.first;

import java.util.Objects;

public class SuperDilennya {
    public static void main(String[] args) {

        System.out.println(seriesSum(5));
    }

    public static String seriesSum(int n) {
        if(n == 0) {
            return "0.00";
        }

        float dil = 4f;
        float res = 1.00f;

        for(int i = 1; i < n; i++) {
            res = res + (1/dil);
            dil+=3f;
        }

        return String.format("%.2f", res);
    }
}
