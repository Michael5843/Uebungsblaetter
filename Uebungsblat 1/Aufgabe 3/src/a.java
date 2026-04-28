import java.util.Iterator;
import java.util.Set;

public class a {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Fehler");
        }
        for (String arg : args) {
            System.out.println(
                    appendTXT(
                            removeAllVowels(arg)
                    ).concat(", "));
        }
    }

    public static String removeAllVowels(String input) {
        return input.replaceAll("[aeiou]", "");
    }

    public static String appendTXT(String input) {
        return input.concat("TXT");
    }
}
