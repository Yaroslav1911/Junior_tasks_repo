package org.example.second;

public class LongestConsec {
    public static void main(String[] args) {
        System.out.println(longestConsec(
                new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
        System.out.println(longestConsec(
                new String[]{""}, 2));
    }

    public static String longestConsec(String[] strarr, int k) {
        if (k > strarr.length || k <= 0)
            return "";

        String longestStr = "";
        for (int index = 0; index < strarr.length - k + 1; index++) {
            StringBuilder sb = new StringBuilder();
            for (int i = index; i < index + k; i++) {
                sb.append(strarr[i]);
            }
            if (sb.toString().length() > longestStr.length()) {
                longestStr = sb.toString();
            }
        }
        return longestStr;
    }

}