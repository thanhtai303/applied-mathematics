import java.util.*;

public class EIDINRATE {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		int testCase = sc.nextInt();
		for (int i = 0; i < testCase; i++) {
			double N = sc.nextDouble();
			double L = sc.nextDouble();
			double M = sc.nextDouble();
			sb.append((int)Math.ceil(Math.log(M / N) / Math.log(1 + (L / 100)))). append( "\n");
		}
		System.out.println(sb);
	}
}