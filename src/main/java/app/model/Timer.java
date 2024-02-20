package app.model;

import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class Timer {

    private Long nanoTime = System.nanoTime();
    public void printTime() {
        System.out.println("Current time: " + LocalTime.now());
    }

    public Long getTime() {
        return nanoTime;
    }
}
