package pooUD6CasoPractico3;

public class Math2 {

    public static double min(double[] array) {
        double min = array[0];
        for (double v : array) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    public static double max(double[] array) {
        double max = array[0];
        for (double v : array) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    public static double sum(double[] array) {
        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        return sum;
    }

    public static double mediaAritmetica(double[] array) {
        return sum(array) / array.length;
    }

    public static double mediaGeometrica(double[] array) {
        double product = 1;
        for (double v : array) {
            product *= v;
        }
        return Math.pow(product, 1.0 / array.length);
    }
}

