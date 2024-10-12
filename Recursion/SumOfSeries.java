public class SumOfSeries {
    static int series(int n) {
        if (n == 0)
            return 0;
        if (n % 2 == 0) {
            // even series
            return series(n-1)-n;
        }
        return series(n-1)+n;
    }

    public static void main(String[] args) {
        System.out.println(series(6));
    }
}
