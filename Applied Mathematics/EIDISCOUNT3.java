import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class EIDISCOUNT3 {
	static InputReader sc = new InputReader(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		double n = sc.nextDouble();
		boolean[] superDiscount = new boolean[3];
		for (int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			if (a == 1) {
				superDiscount[i] = true;
			} else {
				superDiscount[i] = false;
			}
		}

		double tempMoney = n;
		double[] discount = { 0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };
		double[] money = { 0, 5000000, 20000000, 100000000, 300000000, 600000000, 900000000 };
		double temp = 0;
		int level = checkLevel(n, discount);
		for (int i = 0; i < level; i++) {
			if (i < 6) {
				if (n >= money[i + 1] - money[i]) {
					temp += Math.floor(discount[i] * (money[i + 1] - money[i]));
					n -= (money[i + 1] - money[i]);
				} else {
					temp += n * discount[i];
					break;
				}
			} else {
				temp += Math.floor(n * discount[i]);
			}
		}
		double total = (tempMoney - temp);
		for (int i = 0; i < 3; i++) {
			if (superDiscount[i]) {
				total -= Math.ceil(total * 0.02);
			}
		}
		System.out.println(Math.round(Math.floor((total))));
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

	static class InputReader {

		StringTokenizer tokenizer;
		BufferedReader reader;
		String token;
		String temp;

		public InputReader(InputStream stream) {
			tokenizer = null;
			reader = new BufferedReader(new InputStreamReader(stream));
		}

		public InputReader(FileInputStream stream) {
			tokenizer = null;
			reader = new BufferedReader(new InputStreamReader(stream));
		}

		public String nextLine() throws IOException {
			return reader.readLine();
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					if (temp != null) {
						tokenizer = new StringTokenizer(temp);
						temp = null;
					} else {
						tokenizer = new StringTokenizer(reader.readLine());
					}
				} catch (IOException e) {
				}
			}
			return tokenizer.nextToken();
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}