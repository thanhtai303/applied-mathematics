import java.util.*;

public class EIDISCOU {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		double n = sc.nextDouble();
		double tempMoney = n;
		double[] discount = { 0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };
		double[] money = { 0, 2000000, 10000000, 50000000, 100000000, 200000000, 500000000 };
		double temp = 0;
		int level = checkLevel(n, discount);
		for (int i = 0; i < level; i++) {
			if (i < 6) {
				if (n >= money[i + 1] - money[i]) {
					temp += discount[i] * (money[i + 1] - money[i]);
					n -= (money[i + 1] - money[i]);
				} else {
					temp += n * discount[i];
					break;
				}
			} else {
				temp += n * discount[i];
			}
		}
		System.out.println(Math.round(tempMoney - temp));
	}

	public static int checkLevel(double money, double[] check) {
		int level = 0;
		for (double a : check) {
			if (money >= a) {
				level++;
			}
		}
		return level;
	}
}