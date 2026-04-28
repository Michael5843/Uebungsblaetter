import java.time.LocalDate;
import java.time.DayOfWeek;

public class b {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        int monthLength = today.lengthOfMonth();

        int daysTillEOM = monthLength - today.getDayOfMonth();

        System.out.println("Days remaining till EOM: " + daysTillEOM);

        int EOWDays = 0;

        for (int i =  1; i < monthLength; ++i) {
            LocalDate day = today.plusDays(i);
            DayOfWeek weekDay = day.getDayOfWeek();

            if (weekDay == DayOfWeek.SATURDAY || weekDay == DayOfWeek.SUNDAY) {
                EOWDays++;
            }
        }

        System.out.println("End of week days still left in month: " + EOWDays);
    }
}
