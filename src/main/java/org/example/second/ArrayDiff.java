package org.example.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayDiff {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{2})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{}, new int[]{1, 2})));

        Random rnd = new Random();

        int[] array1 = new int[rnd.nextInt(10)];
        int[] array2 = new int[rnd.nextInt(10)];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = rnd.nextInt(10);
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = rnd.nextInt(10);
        }

        System.out.println(Arrays.toString(arrayDiff(array1, array2)));

    }

    public static int[] arrayDiff(int[] a, int[] b) {

        if (a.length == 0 || b.length == 0){
            return a;
        }

        int counter = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                    counter++;
                }
            }
            if(counter == 0){
                list.add(a[i]);
            }
            counter = 0;
        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
