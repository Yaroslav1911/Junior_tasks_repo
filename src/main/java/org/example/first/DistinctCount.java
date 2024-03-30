package org.example.first;

import java.util.HashMap;
import java.util.HashSet;

public class DistinctCount {
    public static void main(String[] args) {

        System.out.println(duplicateCount("abaaaaacdeeeedeaBAAAAA"));
        System.out.println(duplicateCountByStream("abaaaaacdeeeedeaBAAAAA"));

    }

    public static int duplicateCountByStream(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : text.toLowerCase().toCharArray()) {
            map.put(c, map.containsKey(c) ? 1 : 0);
        }
        return (int) map.values().stream().filter(e -> e > 0).count();
    }

    public static int duplicateCount(String text) {
        char[] arr = text.toLowerCase().toCharArray();
        HashSet<Character> set = new HashSet<>();
        int count = 0,
                res = 0;

        for (char chars : arr) {
            for (int i = 0; i < arr.length; i++) {
                if (chars == arr[i] && !set.contains(chars)) {
                    count++;
                }
            }
            if (count >= 2) res++;
            set.add(chars);
            count = 0;
        }

        return res;
    }
}
