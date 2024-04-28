import java.util.*;

public class EIUSAVING {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        double[] interest = { 0, 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664,
                0.0692 };
        double money = sc.nextDouble();
        int n = sc.nextInt();
        int year = n / 12;
        money *= Math.pow(1 + interest[12], year);
        int month = n % 12;
        money = money + money * interest[month] / 12 * month;
        System.out.println(Math.round(money));
    }

}
