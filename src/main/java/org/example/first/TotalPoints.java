package org.example.first;

public class TotalPoints {
    public static void main(String[] args) {
        System.out.println(points(new String[]
                {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"})); //30
    }

    public static int points(String[] games) {
        int points = 0;

        for (int i = 0; i < games.length; i++) {
            int x = games[i].charAt(0);
            int y = games[i].charAt(2);

            if (x > y) {
                points += 3;
            }

            if (x == y) {
                points++;
            }
        }

        return points;
    }
}
