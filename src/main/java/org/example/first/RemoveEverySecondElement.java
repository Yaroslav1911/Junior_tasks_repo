package org.example.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class RemoveEverySecondElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{"Hello", "Goodbye", "Hello Again"})));
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
    }

    public static Object[] removeEveryOther(Object[] arr) {
        ArrayList<Object> list = new ArrayList<>(Arrays.stream(arr).toList());
        for (int i = 0; i < list.size() - 1; i++) {
            list.remove(i +1);
        }
        return list.toArray();
    }
}
