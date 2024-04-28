import java.util.*;

public class EIVINFASTBATERY {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble() / 100;
        n -= m;
        System.out.println(Math.round(((n * Math.pow((1 + r), t) * r) / (Math.pow((1 + r), t) - 1)) + (m * r)));
    }
}
