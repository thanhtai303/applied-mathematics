import java.util.*;

public class EITAX {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		double money = sc.nextDouble();
		money -= 9000000;
		double taxPay = 0;
		double[] tax = { 0.05, 0.1, 0.15, 0.2, 0.25, 0.30, 0.35 };
		double[] check = { 0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000 };
		if (money > 0) {
			int level = checkLevel(money, check);
			for (int i = 0; i < level; i++) {
				if (i < 6) {
					if (money >= check[i + 1] - check[i]) {
						taxPay += tax[i] * (check[i + 1] - check[i]);
						money -= (check[i + 1] - check[i]);
					} else {
						taxPay += money * tax[i];
						break;
					}
				} else {
					taxPay += money * tax[i];
				}
			}
			System.out.println(Math.round(taxPay));
		} else
			System.out.println(0);
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
