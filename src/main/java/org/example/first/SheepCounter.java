package org.example.first;

import java.util.Arrays;
import java.util.Objects;

public class SheepCounter {
    public static void main(String[] args) {

        Boolean[] sheeps = {true, true, true, false,
                            false, null, true, true,
                            true, false, false, true}; // 7 - true, 4 - false, 1 - null

        System.out.println(countSheep(sheeps));

        System.out.println(countingSheep(4));
    }

    public static String countingSheep(int num) {
        String sheep = "";
        for(int i = 1; i < num + 1; i++) {
            sheep = sheep.concat(i + " sheep...");
        }
        return sheep;
    }

    public static int countSheep(Boolean[] arrayOfSheeps){
       return (int) Arrays.stream(arrayOfSheeps).filter(Objects::nonNull)
               .filter(aBoolean -> aBoolean.toString().equals("true")).count();
    }
}
