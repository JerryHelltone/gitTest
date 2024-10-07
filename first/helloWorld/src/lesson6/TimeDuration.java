package lesson6;

public class TimeDuration {
    private static final int MINUTES_IN_HOUR = 60;
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int SECONDS_IN_HOUR = MINUTES_IN_HOUR * SECONDS_IN_MINUTE;

    private int seconds;
    private int minutes;
    private int hours;

    public TimeDuration(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public TimeDuration(int totalSeconds){
        this.hours = totalSeconds / SECONDS_IN_HOUR;
        this.minutes = totalSeconds%SECONDS_IN_HOUR / MINUTES_IN_HOUR;
        this.seconds= totalSeconds%SECONDS_IN_HOUR;
    }

    public int totalSeconds(){
        return hours*SECONDS_IN_HOUR + minutes*SECONDS_IN_MINUTE + seconds;
    }

    public void print(){
        System.out.println("h = " + this.hours + ", m: " + this.minutes + ", s: " + this.seconds);
    }
}
