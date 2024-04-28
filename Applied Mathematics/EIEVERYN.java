import java.util.*;

public class EIEVERYN {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		int testCase = sc.nextInt();
		for (int i = 0; i < testCase; i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int[] check = new int[N + 1];
			boolean flag = true;
			for (int j = 0; j < M; j++) {
				int a = sc.nextInt();
				if (a > N || a < 1) {
				}
			else 	check[a] = 1;
			}

			for (int j = 1; j < N+1; j++) {	
				if (check[j] != 1) {
					flag = false;
				}
			}
			if (flag) {
				sb.append("Yes").append("\n");
			} else {
				sb.append("No").append("\n");
			}
		}
		System.out.println(sb);
	}
}