import java.time.LocalTime;

public class MovieTicket {
    private static double BASE_PRICE;
    private String movieName;
    private LocalTime startTime;


    public MovieTicket(String movieName, LocalTime startTime) {
        this.movieName = movieName;
        this.startTime = startTime;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public double calculatePrice() {
        if (startTime.isBefore(LocalTime.of(17, 0))) {
            return getBasePrice();
        } else if (startTime.isAfter(LocalTime.of(17, 0)) && startTime.isAfter(LocalTime.of(22, 0))) {
            return getBasePrice() * 1.5;
        }

        return getBasePrice() * 2;
    }

    public static double getBasePrice() {
        return BASE_PRICE;
    }
}
