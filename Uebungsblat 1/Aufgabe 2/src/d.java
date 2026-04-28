public class d {
    public static void main(String[] args) {
        String concatedString = "";
        if (args.length < 2) {
            System.err.println("Fehler");
        } else {
            for (String arg : args) {
                concatedString = concatedString.concat(arg);
            }
        }
        concatedString = concatedString.replaceAll("[A-Za-z]", "_");

        System.out.println(concatedString);
    }
}
