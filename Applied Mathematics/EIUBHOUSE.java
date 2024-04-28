import java.util.*;

public class EIUBHOUSE {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		double payAmount = sc.nextDouble();
		double money = sc.nextDouble();
		double month = sc.nextDouble();
		double interestRate = sc.nextDouble() / 100;
		payAmount -= money;
		double payAmountByMonth = (payAmount / month);
		for (int i = 1; i <= month; i++) {
			sb.append(i + " " + Math.round((payAmountByMonth + (payAmount * interestRate))))
					.append("\n");
			payAmount -= payAmountByMonth;
		}
		System.out.println(sb);
	}
}
