package org.example.first;

import java.util.HashMap;
import java.util.Map;

public class StringCamelCase {
    public static void main(String[] args) {

        System.out.println(camelCase("MySupaDupaTest"));    //not simple, but best functionality
        System.out.println(camelCaseReplaceAll("MySupaDupaTest"));
        System.out.println(camelCaseTernary("MySupaDupaTest"));

    }

    public static String camelCaseTernary(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = Character.isUpperCase(input.charAt(i)) ? output + " " + input.charAt(i) : output + input.charAt(i);
        }
        return output;
    }

    public static String camelCaseReplaceAll(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }

    public static String camelCase(String input) {

        Map<Integer, Character> mapa = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            mapa.put(i, (char) (65 + i));
        }

        char[] arr = input.toCharArray();
        String out = "";

        main: for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < mapa.size(); j++) {
                if (arr[i] == mapa.get(j) && i > 0) {
                    out = out.concat(" " + arr[i]);
                    continue main;
                }
            }
            out = out.concat(String.valueOf(arr[i]));
        }

        return out;

    }

}
