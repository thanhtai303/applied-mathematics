import java.util.*;

public class EIGROSS {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		int testcase = sc.nextInt();
		for (int i = 0; i < testcase; i++) {
			double n = sc.nextDouble();
			sb.append((n / 0.9) * 0.1).append("\n");
		}
		System.out.println(sb);
	}
}
