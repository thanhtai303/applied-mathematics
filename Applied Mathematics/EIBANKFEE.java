import java.util.*;

public class EIBANKFEE {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        double money = sc.nextDouble();
        double numberOfCheck = sc.nextDouble();
        check(money, numberOfCheck);
        System.out.println( check(money, numberOfCheck));
    }

    public static double check(double money, double numberOfCheck) {
        double payment = 0;
        if (money < 500) {
            payment += 12 + (numberOfCheck * 0.2);
        } else if (money >= 500 && money <= 1999) {
            payment += 7.5 + (numberOfCheck * 0.2);
        } else if (money >= 2000 && money <= 4999) {
            payment += 5 + (numberOfCheck * 0.1);
        }
        return payment;
    }

}