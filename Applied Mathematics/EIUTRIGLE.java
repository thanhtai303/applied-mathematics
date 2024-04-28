
import java.util.*;

public class EIUTRIGLE {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(countTriangles(arr));
	}

	public static int countTriangles(int[] arr) {
		Arrays.sort(arr);
		int count = 0;
		for (int i = arr.length - 1; i >= 2; i--) {
			int left = 0;
			int right = i - 1;

			while (left < right) {
				if (arr[left] + arr[right] > arr[i]) {
					count += right - left;
					right--;
				} else {
					left++;
				}
			}
		}

		return count;
	}
}