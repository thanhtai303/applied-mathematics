import java.util.*;

public class EIUCUBES {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) {
		int n = sc.nextInt();
		System.out.println(pyramic(n));
	}

	public static int layers(int i) {
		int sum=0;
		for(int j=1;j<=i;j++)
			sum+=j;
		return sum;
			
	}

	public static int pyramic(int k) {
		int count = 0;
		int i = 1;
		int sum = 0;
		while (sum + layers(i) <= k) {
			sum += layers(i);
			i++;
			count++;
		}
		return count;
	}
}
