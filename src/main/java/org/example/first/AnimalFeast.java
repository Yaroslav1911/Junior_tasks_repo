package org.example.first;

public class AnimalFeast {
    public static void main(String[] args) {

        System.out.println(feast("great blue heron", "garlic nann"));
        System.out.println(feast("chickadee","chocolate cake"));
        System.out.println(feast("brown bear","bear claw"));

    }

    public static boolean feast(String beast, String dish) {
        return (dish.startsWith(String.valueOf(beast.charAt(0)))
                && dish.endsWith(String.valueOf(beast.charAt(beast.length() - 1))));
    }
}
