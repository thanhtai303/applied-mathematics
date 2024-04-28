import java.util.*;

public class EIMONE {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        int money = sc.nextInt();
        int dong20 = 0;
        int dong10 = 0;
        int dong5 = 0;
        int dong1 = 0;
        while (money != 0) {
            if (money >= 20) {
                money -= 20;
                dong20 += 1;
            } else if (money >= 10) {
                money -= 10;
                dong10 += 1;
            } else if (money >= 5) {
                money -= 5;
                dong5 += 1;
            } else if (money < 5) {
                money -= 1;
                dong1 += 1;
            }
        }

        if (dong20 != 0) {
            sb.append("20 ").append(dong20).append("\n");
        }
        if (dong10 != 0) {
            sb.append("10 ").append(dong10).append("\n");
        }
        if (dong5 != 0) {
            sb.append("5 ").append(dong5).append("\n");
        }
        if (dong1 != 0) {
            sb.append("1 ").append(dong1);
        }
        System.out.println(sb);
    }

}
