package org.example.executor_IOStreams_desktop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IOStreams {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileToInput = new FileOutputStream("y:/lemonschool/mentor/fileToInput.txt");
        FileOutputStream copiedFile = new FileOutputStream("y:/lemonschool/mentor/copiedFile.txt");
        FileInputStream fileToRead = new FileInputStream("y:/lemonschool/mentor/fileToInput.txt");

        Scanner scn = new Scanner(System.in);
        System.out.println("Write something");
        String text = scn.nextLine();

        fileToInput.write(text.getBytes());

        String title = "Copied data:\n";

        copiedFile.write(title.getBytes());
        while (fileToRead.available() > 0){
            copiedFile.write(fileToRead.read());
        }

        fileToInput.close();
        copiedFile.close();
        fileToRead.close();
    }
}
