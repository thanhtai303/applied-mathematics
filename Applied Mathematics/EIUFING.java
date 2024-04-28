import java.util.*;

public class EIUFING {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		int number = sc.nextInt();
		String[] nameOfFinger = { "Ngon cai cua ban tay trai", "Ngon tro cua ban tay trai",
				"Ngon giua cua ban tay trai", "Ngon ap ut cua ban tay trai", "Ngon ut cua ban tay trai",
				"Ngon ut cua ban tay phai",
				"Ngon ap ut cua ban tay phai", "Ngon giua cua ban tay phai", "Ngon tro cua ban tay phai",
				"Ngon cai cua ban tay phai" };
		if (number <= 10) {
			sb.append(nameOfFinger[number - 1]);
			System.out.println(sb);
		} else if (number > 10 && number <= 18) {
			int[] numberOfFinger = { 19, 18, 17, 16, 15, 14, 13, 12, 11, 10 };
			for (int i = 0; i < numberOfFinger.length; i++) {
				if (numberOfFinger[i] == number) {
					sb.append(nameOfFinger[i]);
					System.out.println(sb);
					break;
				}
			}
		} else if (number > 18) {
			number %= 18;
			if (number <= 10) {
				sb.append(nameOfFinger[number - 1]);
				System.out.println(sb);
			} else {
				int[] numberOfFinger = { 19, 18, 17, 16, 15, 14, 13, 12, 11, 10 };
				for (int i = 0; i < numberOfFinger.length; i++) {
					if (numberOfFinger[i] == number) {
						sb.append(nameOfFinger[i]);
						System.out.println(sb);
						break;
					}
				}
			}
		}
	}

}
