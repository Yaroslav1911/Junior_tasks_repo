package org.example.first;

public class StringCharAt {
    public static void main(String[] args) {

    }

    public static String areYouPlayingBanjo(String name) {

        if(String.valueOf(name.charAt(0)).equalsIgnoreCase("r")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
}
