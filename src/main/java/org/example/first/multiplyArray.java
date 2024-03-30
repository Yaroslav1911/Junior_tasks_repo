package org.example.first;

public class multiplyArray {

    public static void main(String[] args) {

        int[] array = {2, 2, 2, 2, 2, 2};

        System.out.println(multiplyArray(array));
    }

    private static int multiplyArray(int[] array) {
        int res = 1;
        for(int values : array) {
            res *= values;
        }
        return res;
    }
}
