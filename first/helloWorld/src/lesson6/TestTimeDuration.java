package lesson6;

public class TestTimeDuration {
    public static void main(String[] args) {
        TimeDuration timeDuration = new TimeDuration(865336);
        timeDuration.print();
        System.out.println(timeDuration.totalSeconds());
    }
}
