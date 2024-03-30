package org.example.first;

public class Isogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics")); //true
        System.out.println(isIsogram("moose")); //false
        System.out.println(isIsogramLogical("Dermatoglyphics")); //true
        System.out.println(isIsogramLogical("moose")); //false
    }

    public static boolean isIsogramLogical(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }

    public static boolean isIsogram(String str) {

        char[] arr = str.toLowerCase().toCharArray();
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) counter++;
            }
            if (counter >= 2) {
                return false;
            } else {
                counter = 0;
            }
        }

        return true;

    }
}
