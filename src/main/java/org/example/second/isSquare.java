package org.example.second;

public class isSquare {
    public static void main(String[] args) {
        System.out.println(isSquareSimple(25));
        System.out.println(isSquareSimple(26));
        System.out.println(isSquareSimple(120961089));
    }

    public static boolean isSquareSimple(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

}
