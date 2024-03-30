package org.example.timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerService {
    Timer timer = new Timer();

    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            System.out.println("go");
        }
    };

    public void run(){
        timer.scheduleAtFixedRate(task, 0, 2000);
    }

}

