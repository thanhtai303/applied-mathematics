import java.util.*;

public class EIUMARKUP {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		int product = sc.nextInt();
		int cost = 0;
		int price = 200;
		while (product > 0) {

			if (product >= 100 && price > 180) {
				cost += 100 * price;
				price -= 1;
				product -= 100;
			} else if (product >= 100 && price == 180) {
				cost += 100 * price;
				product -= 100;
			} else {
				cost += product * price;
				break;
			}
		}
		System.out.println(cost);
	}
}
