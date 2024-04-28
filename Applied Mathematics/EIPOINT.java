import java.util.*;

public class EIPOINT {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int score = sc.nextInt();
        check(score);
        System.out.println(sb);
    }

    public static void check(int score) {
        if (score >= 90) {
            sb.append("A");
        } else if (score < 90 && score >= 85) {
            sb.append("A-");
        } else if (score < 85 && score >= 80) {
            sb.append("B+");
        } else if (score < 80 && score >= 75) {
            sb.append("B");
        } else if (score < 75 && score >= 70) {
            sb.append("B-");
        } else if (score < 70 && score >= 65) {
            sb.append("C+");
        } else if (score < 65 && score >= 60) {
            sb.append("C");
        } else if (score < 60 && score >= 55) {
            sb.append("C-");
        } else if (score < 55 && score >= 53) {
            sb.append("D+");
        } else if (score < 53 && score >= 52) {
            sb.append("D");
        } else if (score < 52 && score >= 50) {
            sb.append("D-");
        } else if (score < 50) {
            sb.append("F");
        }
    }

}
