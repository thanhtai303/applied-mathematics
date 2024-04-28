import java.util.*;

public class EIBANKLOAN2 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		double money = sc.nextDouble();
		double pay = sc.nextDouble();
		double rate = sc.nextDouble() / 1200;
		System.out.println(count(money, pay, rate));
	}
	static long count(double money, double pay, double rate) {
        long month = 0;
        while (money >= 0) {
            month++;
            money = money * (1 + rate) - pay;
        }
        return month;
    }
}
