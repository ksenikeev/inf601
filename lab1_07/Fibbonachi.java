public class Fibbonachi {
    public static void main(String[] args) {
        int[] a = new int[10];
//        fillArrayByFibonacci(a);
//        for (int b: a) {
//            System.out.println(b);
//        }
        for (int i = 0; i < a.length; ++i) {
            a[i] = fibbonacci(i);
            System.out.println(a[i]);
        }
    }

    public static void fillArrayByFibonacci(int[] a) {
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < a.length; ++i) {
            a[i] = a[i - 2] + a[i - 1];
        }
    }

    public static int fibbonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibbonacci(n - 2) + fibbonacci(n - 1);
    }
}