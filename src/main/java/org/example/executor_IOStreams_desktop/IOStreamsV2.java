package org.example.executor_IOStreams_desktop;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class IOStreamsV2 {
    public static void main(String[] args) throws IOException {
        try(
                FileOutputStream fileToInput = new FileOutputStream("y:/lemonschool/mentor/fileToInputV2.txt");
                FileOutputStream copiedFile = new FileOutputStream("y:/lemonschool/mentor/copiedFileV2.txt");
                FileInputStream fileToRead = new FileInputStream("y:/lemonschool/mentor/fileToInputV2.txt")
        ) {

            Scanner scn = new Scanner(System.in);
            System.out.println("Write something");
            String text = scn.nextLine();

            fileToInput.write(text.getBytes());

            String title = "Copied data:\n";

            copiedFile.write(title.getBytes());

            while (fileToRead.available() > 0) {
                copiedFile.write(fileToRead.read());
            }

        } catch (IOException e) {
            System.out.println("Some error: " + e);
        }


        File file1 = new File("y:/lemonschool/mentor/fileToInputV2.txt");
        File file2 = new File("y:/lemonschool/mentor/copiedFileV2.txt");
        Desktop desktop = Desktop.getDesktop();

        BufferedReader br = new BufferedReader(new FileReader(file2));
        int i = 0;
        while ((i = br.read())!= - 1) {
            System.out.print((char) i);
        }

        if (file1.exists() && file2.exists()){
            try {
                desktop.open(file1);
                desktop.open(file2);
            } catch (IOException e) {
                System.out.println("Some desktop error: " + e);
            }
        }
    }
}
