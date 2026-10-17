public class Sinus{
    public static void main(String[] args){
        System.out.println(sin(3.1415/2));
    }
    static double sin(double x){
        double a = x;
        double s = x;
        double eps =1e-6;
        int sign = -1;
        int n = 1;
        int k = 0;
        while (a > eps || a < -eps){
            a *= x * x / ((n + 1) * (n + 2));
            s += sign * a;
            sign = -sign;
            n += 2;
            System.out.println(k++);
        }
        return s;
    }
}