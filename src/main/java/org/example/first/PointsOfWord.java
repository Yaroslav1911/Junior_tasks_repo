package org.example.first;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PointsOfWord {
    public static void main(String[] args) {
//        System.out.println(high("man i taxi need a taxi up to ubud"));
//        System.out.println(high("take me to semynak"));
        System.out.println(high("b aa"));
    }

    public static String high(String s) {

        Map<Character, Integer> mapa = new HashMap<>();

        for (int i = 1; i < 28; i++) {
            char az = (char) (96 + i);
            mapa.put(az , i);
        }

        String[] arr = s.split(" ");
        Map<String, Integer> words = new HashMap<>();
        int score = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if(mapa.containsKey(arr[i].charAt(j))) {
                    score += mapa.get(arr[i].charAt(j));
                }
            }
            words.put(arr[i], score);
            score = 0;
        }

        return Collections.max(words.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
