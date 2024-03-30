package org.example.executor_IOStreams_desktop;

import java.io.IOException;

public class ExeRun {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();


        try {
            Process p = r.exec("notepad.exe");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
