public class c {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();

        System.out.println(a + "\n" + b + "\n" + c);

        double max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);

        double maxed = Math.max(a, Math.max(b, c));
        System.out.println(maxed);
    }
}
