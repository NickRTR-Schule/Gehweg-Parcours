package fachkonzept;

public final class Time {

    private enum Components {
        seconds,
        minutes,
        hours,
    }
    private int seconds;

    private int minutes;

    private int hours;

    public void addSecond() {
        if(seconds == 60) {
            seconds = 0;
            addMinutes(1);
        } else {
            addSeconds(1);
        }
    }

    private void addSeconds(int value) {
        if(value / 3600 >= 1) {
            int h = value / 3600;
            hours += h;
            value -= h;
        }
        if(value / 60 >= 1) {
            int m = value / 60;
            minutes += m;
            value -= m;
        }
        if(value > 0) {
            seconds += value;
        }
    }

    public void addMinute() {
        if(minutes == 60) {
            minutes = 0;
            hours++;
        } else {
            minutes++;
        }
    }

    private void addMinutes(int value) {
        if(value / 60 >= 1) {
            int h = value / 60;
            hours += h;
            value -= h;
        }
        if(value > 0) {
            minutes += value;
        }
    }

    public void addHour() {
        addHours(1);
    }

    private void addHours(int value) {
       hours += value;
    }

    public void addTime(int value, Components components) {
        switch (components) {
            case seconds -> seconds += value;
            case minutes -> minutes += value;
            case hours -> hours += value;
        }
    }

    public String toString() {
        return hours + " : " + minutes + " : " + seconds;
    }
}
