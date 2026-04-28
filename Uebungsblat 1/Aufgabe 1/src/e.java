
public class e {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < 1000; ++i) {
            double randNum = Math.random();
            if (randNum > 0.4 && randNum < 0.6) {
                count++;
            }
        }
        System.out.println(count);
    }
}
