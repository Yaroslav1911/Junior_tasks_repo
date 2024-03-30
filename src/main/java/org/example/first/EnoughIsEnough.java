package org.example.first;

import java.util.ArrayList;
import java.util.Arrays;

public class EnoughIsEnough {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[]{20, 37, 20, 21}, 1)));
        System.out.println(Arrays.toString(deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )));
        System.out.println(Arrays.toString(deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )));
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        if(maxOccurrences == 0) {
            return new int[]{0};
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0, counter = 0; i < elements.length; i++) {

            if (!list.contains(elements[i])) {
                list.add(elements[i]);
            } else {
                for (int j = 0; j < list.size(); j++) {
                    if(list.get(j).equals(elements[i])){
                        counter++;
                    }
                }
                if(counter < maxOccurrences) list.add(elements[i]);
                counter = 0;
            }

        }

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

}
