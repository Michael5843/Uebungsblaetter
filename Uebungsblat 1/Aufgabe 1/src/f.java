import java.util.Random;

public class f {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; ++i) {
            if (random.nextBoolean()) {
                 System.out.println((int)Math.pow((int)random.nextInt(1, 1001), 2));
            }
        }
    }
}
