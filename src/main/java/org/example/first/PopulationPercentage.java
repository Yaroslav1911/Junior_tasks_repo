package org.example.first;

public class PopulationPercentage {
    public static void main(String[] args) {

        System.out.println(nbYear(1500000, 0.25, 1000, 2000000));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {

        int years = 0;

        while (p > p0) {
            p0 += ((p0 / 100) * percent) + aug;
            years++;
        }

        return years;

    }
}
