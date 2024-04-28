import java.util.*;

public class EIUCHRMS {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static double[] rate = { 0.03, 0.04, 0.05, 0.06, 0.07, 0.08, 0.09, 0.1 };
    static double[] rangeMoney = { 0, 2000000, 5000000, 10000000, 20000000, 50000000, 100000000, 200000000 };

    public static void main(String[] args) {
        int n = sc.nextInt();
        double money = 0;
        double discount = 0;
        for (int i = 0; i < n; i++) {
            double price = sc.nextDouble();
            money += price;
            discount += checkLevel(price);
        }
        System.out.println(Math.round(money - discount));
    }

    public static double checkLevel(double money) {
        for (int i = rangeMoney.length - 1; i >= 0; i--) {
            if (money > rangeMoney[i]) {
                return money * rate[i];
            }
        }
        return 0;
    }

}
