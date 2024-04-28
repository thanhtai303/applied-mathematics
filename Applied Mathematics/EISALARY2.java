import java.util.*;

public class EISALARY2 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		int numberOfPeople = sc.nextInt();
		double totalOfficeHour = 0;
		double totalOvertimeHour = 0;
		double totalOfficeWage = 0;
		double totalOvertimeWage = 0;
		for (int i = 0; i < numberOfPeople; i++) {
			double officeHour = 0;
			double overtime = 0;
			double salary = 0;
			for (int j = 0; j < 5; j++) {
				double hour = sc.nextDouble();
				if (hour <= 8) {
					officeHour += hour;
				} else {
					officeHour += 8;
					overtime += hour - 8;
				}
			}
			double wage = sc.nextDouble();
			totalOfficeHour += officeHour;
			totalOvertimeHour += overtime;
			totalOfficeWage += officeHour * wage;
			totalOvertimeWage += overtime * (wage * 1.5);
			salary += (officeHour * wage) + (overtime * (wage * 1.5));
			sb.append((double) Math.round(salary * 100) / 100).append("\n");
		}
		if (totalOfficeHour == 0) {
			sb.append(0.0).append("\n");
		} else {
			sb.append((double) Math.round((totalOfficeWage / totalOfficeHour) * 100) / 100).append("\n");
		}
		if (totalOvertimeHour == 0) {
			sb.append(0.0).append("\n");
		} else {
			sb.append((double) Math.round((totalOvertimeWage / totalOvertimeHour) * 100) / 100);
		}
		System.out.println(sb);
	}
}