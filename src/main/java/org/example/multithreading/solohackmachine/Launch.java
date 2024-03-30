package org.example.multithreading.solohackmachine;

import java.util.Random;

public class Launch {
    public static void main(String[] args) {


        int[] locked = new int[4];

        for (int i = 0; i < locked.length; i++) {
            locked[i] = new Random().nextInt(1_000_000);
        }

        HackMachine hackMachine = new HackMachine(locked);

        hackMachine.start();
    }
}
