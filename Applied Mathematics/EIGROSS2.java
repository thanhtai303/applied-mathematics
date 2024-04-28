import java.util.Scanner;

class EIGROSS2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        solve();
    }


    public static void solve() {
        double amount = sc.nextDouble();
        countNet(amount);
        double high = amount * 2;
        double low = amount;
        double mid = 0;
        while (high - low > 0.001) {
            mid = (high + low) / 2;
            if (countNet(mid) == amount)
                break;
            if (countNet(mid) > amount) {
                high = mid;
            } else {
                low = mid;
            }
        }
        System.out.println(Math.round(mid));
    }

    public static double countNet(double amount) {
        double[] levels = { 80000000, 52000000, 32000000, 18000000, 10000000, 5000000, 0 };
        double[] taxes = { 0.35, 0.3, 0.25, 0.2, 0.15, 0.1, 0.05 };
        double temp = amount - 11000000;
        // Compare each level
        double finalNet = 0;
        for (var i = 0; i < levels.length; i++) {
            if (temp > levels[i]) {
                finalNet += (temp - levels[i]) * taxes[i];
                temp = levels[i];
            }
        }

        return (amount - finalNet);
    }
}
