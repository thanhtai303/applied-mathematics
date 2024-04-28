import java.util.*;

public class EIBANKRATE {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        double money = sc.nextDouble();
        int n = sc.nextInt();
        // int year = n / 12;
        // money *= Math.pow(1 + 0.09, (double) year);
        // int month = n % 12;
        money = money + money * 0.09 / 12 * (double) n;
        System.out.println((money));
    }

}
