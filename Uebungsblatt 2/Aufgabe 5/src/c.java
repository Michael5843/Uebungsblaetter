import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        for (String arg : args) {
            Scanner scanner = new Scanner(arg);
            int summe = 0;

            while (scanner.hasNextInt()) {
                summe += scanner.nextInt();
            }
            System.out.println("Summe der Kommandozeilenparameter: " + summe);
            scanner.close();
        }
    }
}
