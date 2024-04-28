import java.util.*;

public class EIUMADIS {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		long check = 0;
		long min = a[0];
		for (int i = 0; i < n - 1; i++) {
			long temp = a[i + 1] - min;
			if (a[i] < min) {
				min = a[i];
			}
			if (check < temp && temp>0) {
				check = temp;
			}
		}
		if (a[n - 1] - min > check) {
			check = a[n - 1] - min;
		}
		System.out.println(check);

	}
}