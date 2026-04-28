import java.util.Scanner;

public class aAndB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine Zahl zwischen 0 und 50 ein: ");

        if (scanner.hasNextInt()) {

            int zahl = scanner.nextInt();

            if (zahl >= 0 && zahl <= 50) {
                System.out.println("Eingegebene zahl: " + zahl);
            } else {
                System.out.println("Fehler: Zahl muss zwischen 0 und 50 sein");
            }
        } else {
            System.err.println("Fehler: Eingegebene zahl ist kein Integer");
            System.exit(1);
        }
        scanner.close();

    }
}
