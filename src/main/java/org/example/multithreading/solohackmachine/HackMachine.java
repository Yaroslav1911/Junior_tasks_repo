package org.example.multithreading.solohackmachine;

import java.util.Random;

public class HackMachine extends Thread {
    private final int[] array;
    private int bound = 1_000_000;

    public HackMachine(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        hacking(bound);
    }

    private void hacking(int bounded) {
        int a, b, c, d, sum = 0;
        boolean first = true,
                second = true,
                third = true,
                fourth = true;
        long start = System.currentTimeMillis();

        while (first){
            int x1 = new Random().nextInt(bounded);
            System.out.println(x1);
            sum++;

            if (x1 == array[0]) {
                a = x1;
                System.out.println("\tFirst " + x1);

                while (second){
                    int x2 = new Random().nextInt(bounded);
                    System.out.println(x2);
                    sum++;

                    if (x2 == array[1]) {
                        b = x2;
                        System.out.println("\tSecond " + x2);

                        while (third){
                            int x3 = new Random().nextInt(bounded);
                            System.out.println(x3);
                            sum++;

                            if (x3 == array[2]) {
                                c = x3;
                                System.out.println("\tThird " + x3);

                                while (fourth){
                                    int x4 = new Random().nextInt(bounded);
                                    System.out.println(x4);
                                    sum++;

                                    if (x4 == array[3]) {
                                        d = x4;
                                        System.out.println("\tFourth " + x4);
                                        System.out.printf("Hacked! Password is: %s - %s -  %s -  %s", a, b, c, d);
                                        first = false;
                                        second = false;
                                        third = false;
                                        fourth = false;
                                        long end = System.currentTimeMillis();
                                        System.out.println("\n\nIt needed just " + (end - start) + "ms");
                                        System.out.println("Or " + ((end - start) / 1000) + "sec");
                                        System.out.println("With " + sum + " iterations");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
