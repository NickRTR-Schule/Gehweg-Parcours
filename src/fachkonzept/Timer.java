package fachkonzept;

import fachkonzept.Timer;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 * Timer, mit welchem man
 * die Zeit für das Spiel stoppen kann
 */
public final class Timer {
    /**
     * Die tatsächliche Zeit
     */
    private Time time = new Time();

    private Thread thread;

    private JLabel label;


    public Timer() {
        thread = new Thread();
        thread.start();
    }

    public void startTimer() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ignored) {
                thread.interrupt();
            }
            time.addSecond();
            label.setText(time.toString());
        }
    }

    /**
     * This toggles the break state
     * of the timer
     */
    public void toggleBreak() {
        if (thread.isInterrupted()) {
            thread.start();
        } else {
            thread.interrupt();
        }
    }

    public Time stopTimer() {
        thread.interrupt();
        return getTime();
    }

    public Time getTime() {
        return Objects.requireNonNullElseGet(time, Time::new);
    }

    public void setComponent(JLabel label) {
        this.label = label;
    }
}
