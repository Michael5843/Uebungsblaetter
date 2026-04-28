import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.Arrays;
import java.util.Random;
import java.time.chrono.*;


public class c {
    public static void main(String[] args) {
        LocalTime t1 = randTime();
        LocalTime t2 = randTime();

        if (t1.isAfter(t2)) {
            LocalTime temp = t1;
            t1 = t2;
            t2 = temp;
        }
        System.out.println("First time: " + t1);
        System.out.println("Second time: " + t2);

        if (ChronoUnit.MINUTES.between(t1, t2) > 15) {
            LocalTime temp = randTime();
            if (temp.isAfter(t1) && temp.isBefore(t2)) {
                t2 = temp;
            }
        }
        System.out.println("First time: " + t1);
        System.out.println("Second time: " + t2);
    }

    public static LocalTime randTime() {
        Random rand = new Random();

        int h = rand.nextInt(24);
        int m = rand.nextInt(60);

        return LocalTime.of(h, m);
    }
}
