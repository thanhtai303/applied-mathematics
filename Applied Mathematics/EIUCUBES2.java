import java.util.*;

public class EIUCUBES2 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		int testcase = sc.nextInt();
		for (int i = 0; i < testcase; i++) {
			long n = sc.nextLong();
			sb.append(pyramic(n)).append(" ");
		}
		System.out.println(sb);
	}

	public static long layers(long i) {
		int sum = 0;
		for (int j = 1; j <= i; j++)
			sum += j;
		return sum;

	}

	public static long pyramic(long k) {
		long h=(long)Math.floor(Math.cbrt(k*6));
		if((h*(h+1)*(h+2))>(6*k)){
			h-=1;
		}return h;
	}
}
