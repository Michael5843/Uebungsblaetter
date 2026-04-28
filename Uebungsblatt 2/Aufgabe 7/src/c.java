import java.time.LocalTime;

public class c {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Das große Krabbeln", LocalTime.of(14, 00));
        MovieTicket ticket2 = new MovieTicket("Krieg der Sterne", LocalTime.of(18, 00));
        MovieTicket ticket3 = new MovieTicket("Der Weiße Hai", LocalTime.of(23, 00));

        MovieTicket[] tickets = {ticket1, ticket2, ticket3};

        double sum = 0;
        for (MovieTicket ticket : tickets) {
            sum += ticket.calculatePrice();
        }

    }
}
