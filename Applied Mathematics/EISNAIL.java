import java.util.*;

public class EISNAIL {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int climbMeters = sc.nextInt();
		int dropMeters = sc.nextInt();
		int height = sc.nextInt();
		System.out.println(count(climbMeters, dropMeters, height));
	}

	public static int count(int climbMeters, int dropMeters, int height) {
		if (climbMeters==height) {
			return 1;
		}else if ((height-dropMeters)%(climbMeters-dropMeters)==0) {
			return (height-dropMeters)/(climbMeters-dropMeters);
		}else return (height-dropMeters)/(climbMeters-dropMeters)+1;
	}

}
