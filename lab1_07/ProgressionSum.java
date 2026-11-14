public class ProgressionSum {
    public static void main(String[] args) {
        System.out.println(sum(3,1,2));
    }

    public static int sum(int n, int p, int r) {
        if (n == 1) return p;
        return sum(n - 1, p, r) + p + r * (n - 1);
    }
}