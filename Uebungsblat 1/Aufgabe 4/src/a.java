import java.util.Arrays;
import java.util.Random;

public class a {
    public static void main(String[] args) {
        double[] vector1 = myVectorRandom();
        double[] vector2 = myVectorRandom();

        System.out.println(Arrays.toString(vector1) + "\n" + Arrays.toString(vector2));

        System.out.println(myScalarProduct(vector1, vector2));

        System.out.println(Arrays.toString(myCrossProduct(vector1, vector2)));
    }

    public static double[] myVectorRandom() {
        Random rand = new Random();
        double[] myVector = new double[]{rand.nextDouble(), rand.nextDouble(), rand.nextDouble()};
        return myVector;
    }

    public static void myVectorPrint(double[] myVector) {
        System.out.println(Arrays.toString(myVector));
    }

    public static double myScalarProduct(double[] vector1, double[] vector2) {
        double sum = 0;
        for (int i = 0; i < 3; ++i) {
            sum += vector1[i] * vector2[i];
        }
        return sum;
    }

    public static double[] myCrossProduct(double[] vector1, double[] vector2) {
        double[] crossProduct = new double[3];

        crossProduct[0] = vector1[1] * vector2[2] - vector1[2] * vector2[1];
        crossProduct[1] = vector1[2] * vector2[0] - vector1[0] * vector2[2];
        crossProduct[2] = vector1[0] * vector2[1] - vector1[1] * vector2[0];

        return crossProduct;
    }

}
