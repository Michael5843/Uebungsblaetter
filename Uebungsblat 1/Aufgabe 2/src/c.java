public class c {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Fehler");
        } else {
            for (String word : args[0].split(",")) {
                System.out.println(word);
            }
        }
    }
}
