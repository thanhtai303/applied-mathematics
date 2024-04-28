import java.util.*;

public class EIPURCHASE1 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		double money = sc.nextDouble();
		double month = sc.nextDouble();
		double pay = sc.nextDouble();
		double payEachMonth = sc.nextDouble();
		double temp = 0;
		double rate = 0.000001;
		money -= pay;
		while (payEachMonth-temp > 0.000001) {
			temp = (money * Math.pow((1 + rate), month) * rate) / (Math.pow((1 + rate), month) - 1);
			rate += 0.000001;
		}
		rate-=0.000002;
		System.out.printf("%.3f%n",rate);
	}
}
