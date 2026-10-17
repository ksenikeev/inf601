public class Exponenta {
    public static void main (String[] args) {
        System.out.println(exp(1));
    }

    static double exp(double x) {
        double s = 1;
        double epsilant=1e-6;
        double a = 1;
        int n=1;

        while (a > epsilant || a < -epsilant) {
            a = a * x / n++;
            s += a;
        }

        return s;
    }
}