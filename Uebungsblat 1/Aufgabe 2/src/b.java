public class b {
    public static void main(String[] args) {
        int sumLenght = 0;

        for (String arg : args) {
            sumLenght += arg.length();
        }

        System.out.println("Es wurden insgesammt " + sumLenght + " Zeichen als Kommandozeilenparameter ausgegeben");
    }
}
