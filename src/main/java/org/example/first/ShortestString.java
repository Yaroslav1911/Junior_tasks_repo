package org.example.first;

import java.util.stream.Stream;

public class ShortestString {
    public static void main(String[] args) {

        System.out.println(findShort("Let's travel abroad shall we"));
        System.out.println(findShortByStream("Let's travel abroad shall we"));
    }

    public static int findShortByStream(String s) {
        return Stream.of(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }

    public static int findShort(String s) {
        String[] list = s.split(" ");
        String output = list[0];
        for (int i = 0; i < list.length; i++) {
            if(list[i].length() <= output.length()) {
                output = list[i];
            }
        }
        return output.length();
    }
}
