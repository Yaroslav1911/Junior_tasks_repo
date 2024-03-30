package org.example.multithreading.fourhackmachines;

import java.util.Random;

public class MultiHackingMachine extends Thread {
        private final int[] array;
        private final int index;
        private final int bound;

    public MultiHackingMachine(String name, int[] array, int index, int bound) {
        super(name);
        this.array = array;
        this.index = index;
        this.bound = bound;
    }

    @Override
    public void run() {
        multiHack(array, index);
    }

    private void multiHack(int[] array, int index) {
        boolean hacking = true;

        while (hacking) {
            int x = new Random().nextInt(bound);
            System.out.println(x);

            if (x == array[index]) {
//                System.out.println("\t" + this.getName() + " " + x);
                LaunchMulti.password[index] = x;
                hacking = false;
            }
        }
    }
}