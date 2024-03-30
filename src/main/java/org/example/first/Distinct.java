package org.example.first;

import java.util.Arrays;
import java.util.HashSet;

public class Distinct {
    public static void main(String[] args) {
        System.out.println(longest("aretheyhere", "yestheyarehere"));
        System.out.println();
        System.out.println(longestButShortest("aretheyhere", "yestheyarehere"));
        System.out.println();
        System.out.println(longestButClever("aretheyhere", "yestheyarehere"));
    }

    public static String longestButClever (String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        (s1 + s2).chars().distinct().sorted().forEach(c -> sb.append((char) c));
        return sb.toString();
    }

    public static String longestButShortest (String s1, String s2) {
        String s = s1 + s2;
        return s.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint,
                StringBuilder::append).toString();
    }

    public static String longest (String s1, String s2) {

        String full = s1.concat(s2);

        char[] arr = full.toCharArray();
        Arrays.sort(arr);

        HashSet<Character> set = new HashSet<>();
        StringBuilder builder = new StringBuilder();

        for(Character chars : arr) {
            if(set.add(chars)) {
                builder.append(chars);
            }
        }

        return String.valueOf(builder);

    }
}
