import java.util.*;

public class EIUBIRTH {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		int testCase = sc.nextInt();
		for (int i = 0; i < testCase; i++) {
			long blue = sc.nextLong();
			long red = sc.nextLong();
			long priceBlue = sc.nextLong();
			long priceRed = sc.nextLong();
			long change = sc.nextLong();
			sb.append(check(blue, red, priceBlue, priceRed, change)).append("\n");
		}
		System.out.println(sb);

	}

	public static long check(long blue, long red, long priceBlue, long priceRed, long change) {
		if (priceBlue + change < priceRed) {
			return priceBlue * (blue + red) + change * red;
		} else if (priceRed + change < priceBlue) {
			return priceRed * (blue + red) + change * blue;
		} else {
			return priceBlue * blue + priceRed * red;
		}
	}

}
