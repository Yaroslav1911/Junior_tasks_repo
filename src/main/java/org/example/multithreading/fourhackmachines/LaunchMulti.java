package org.example.multithreading.fourhackmachines;

import java.util.Arrays;
import java.util.Random;

public class LaunchMulti {
    public static int[] password = new int[4];

    public static void main(String[] args) throws InterruptedException {

        int bound = 1_000_000;

        int[] locked = new int[4];

        for (int i = 0; i < locked.length; i++) {
            locked[i] = new Random().nextInt(bound);
        }

        MultiHackingMachine hack1 = new MultiHackingMachine("first", locked, 0, bound);
        MultiHackingMachine hack2 = new MultiHackingMachine("second", locked, 1, bound);
        MultiHackingMachine hack3 = new MultiHackingMachine("third", locked, 2, bound);
        MultiHackingMachine hack4 = new MultiHackingMachine("fourth", locked, 3, bound);

        hack1.start();
        hack2.start();
        hack3.start();
        hack4.start();

        Thread.sleep(15_000);
        System.out.println("\nLocker is:\t\t" + Arrays.toString(locked));
        System.out.println("Password is:\t" + Arrays.toString(password));
    }
}
