
import java.util.*;

class EIBANKLOAN3 {
    static Scanner reader = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    private static double loanAmount, monthlyPayment, interestRate, penaltyRate, mustPay, monthlyRate, interest;
    private static int period;
    private static double prepaid = 0;

    public static void main(String[] args) {
        solve();
        System.out.println(sb);
    }

    public static void solve() {
        getInput();
        int n = 1;
        double mustPayTemp = mustPay;
        while (loanAmount > 0) {
            interest = loanAmount * monthlyRate;
            prepaid = (monthlyPayment - (mustPayTemp + interest)) / (1 + penaltyRate);

            loanAmount -= (mustPayTemp + prepaid);

            mustPayTemp = Math.max(mustPay - prepaid, 0);
            loanAmount = (loanAmount > 0) ? loanAmount : 0;

            sb.append(n).append(" ").append(Math.round(loanAmount)).append("\n");
            n++;
        }
    }

    public static void getInput() {
        loanAmount = reader.nextDouble();
        monthlyPayment = reader.nextDouble();
        period = reader.nextInt();
        interestRate = reader.nextDouble() / 100;
        penaltyRate = reader.nextDouble() / 100;
        mustPay = loanAmount / period;
        monthlyRate = (interestRate / 12);
        interest = loanAmount * interestRate / period;
    }
}
