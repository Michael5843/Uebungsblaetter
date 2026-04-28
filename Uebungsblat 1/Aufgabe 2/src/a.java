public class a {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Keine Kommandozeilenparameter");
        } else {
            int count = 0;
            for (int i = 0; i < args[0].length(); ++i) {
                if (args[0].charAt(i) == 'e') {
                    count++;
                }
            }
            System.out.println("Count of 'e' in parameter: " + count);
        }
    }
}
