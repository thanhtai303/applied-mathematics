import java.util.*;

public class EIPURCHASE3 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		double money = sc.nextDouble();
		double pay = sc.nextDouble();
		double month = sc.nextDouble();
		double rate = sc.nextDouble();

		double payEachMonth =0;
		money -= pay;
			payEachMonth = (money * Math.pow((1 + rate), month) * rate) / (Math.pow((1 + rate), month) - 1);
		System.out.print((long)Math.floor(payEachMonth));
	}
}
