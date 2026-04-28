import java.time.LocalDate;
import java.time.Period;

public class a {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate examenDay = LocalDate.of(2027, 7,28);

        Period span = Period.between(today, examenDay);

        System.out.println("Months left: " + span.getMonths());
        System.out.println(" + days left: " + span.getDays());
    }
}
