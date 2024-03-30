package org.example.executor_IOStreams_desktop;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class DesktopPlaying {
    public static void main(String[] args) throws IOException {
        Desktop desktop = Desktop.getDesktop();

        File file = new File("C:\\Windows\\system32\\mspaint.exe");

        if (file.exists()) {
            desktop.open(file);
//            desktop.browse(URI.create("steam:###));
        }
    }
}
