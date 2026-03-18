//Leetcode 50. Pow(x, n)
//Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).

class ImplementPow {
    public double myPow(double x, int n) {
        long N = n;
        double result = 1.0;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        for (int i = 0; i < N; i++) {
            result = result * x;
        }
        return result;
    }
}