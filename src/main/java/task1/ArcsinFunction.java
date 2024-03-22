package task1;

public class ArcsinFunction {

    public static double arcsin(double x) {
        if (Math.abs(x) > 1) {
            return Double.NaN;
        }

        double ans = x;
        double tmp = x;

        int i = 1;
        while (Math.abs(tmp) > 0.0001) {
            tmp *= x * x * (2 * i - 1) * (2 * i - 1) / ((2 * i) * (2 * i + 1));
            ans += tmp;
            i++;
        }

        return ans;
    }

}
