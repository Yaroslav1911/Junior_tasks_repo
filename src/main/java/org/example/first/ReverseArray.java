package org.example.first;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(reverse(5)));

    }

    public static int[] reverse(int n){

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = n;
            n--;
        }
        return arr;
    }
}
