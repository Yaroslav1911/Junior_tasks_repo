package org.example.second;

public class OppositesAttract {
    public static void main(String[] args) {
        System.out.println(isLove(4, 1));
        System.out.println(isLove(4, 4));
        System.out.println(isLove(4, 3));
        System.out.println(isLove(5, 0));
    }

    public static boolean isSimpleLove(final int flower1, final int flower2) {
        return flower1 % 2 != flower2 % 2;
    }

    public static boolean isLove(final int flower1, final int flower2) {

        if (flower1 == 1 && flower2 % 2 == 0) return true;
        if (flower1 == 0 && flower2 % 2 != 0) return true;
        if (flower1 % 2 != 0 && flower2 % 2 == 0) return true;
        return flower1 % 2 == 0 && flower2 % 2 != 0;

    }
}
