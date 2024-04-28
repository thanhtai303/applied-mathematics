import java.util.*;
import java.io.*;

class EIUCREDIT {
    static InputReader reader = new InputReader(System.in);
    static StringBuilder sb = new StringBuilder();
    static int currentMonth = 31;
    static double currentAmount = 0;
    static double dept = 0;
    static long numberOfCheckout, timeToCount;
    static double rate;

    public static void main(String[] args) {
        getInput();
        System.out.printf("%.3f", currentAmount);
    }

    public static void getInput() {
        numberOfCheckout = reader.nextLong();
        rate = reader.nextDouble();
        timeToCount = reader.nextLong();
        Map<Integer, Double> listCheckout = new LinkedHashMap<>();

        // Add checkout into map
        for (int i = 0; i < numberOfCheckout; i++) {
            int day = reader.nextInt();
            double amount = reader.nextLong();
            if(listCheckout.containsKey(day)) {
                listCheckout.put(day, listCheckout.get(day) + amount);
            } else {
                listCheckout.put(day, amount);
            }
        }

        //
        countDept(listCheckout);
    }

    public static void doTransaction(int time, double amount) {
        // Check the day, if the day > 31, 61, 91,... will consider a month
        // Average Daily Balance Method:
        // Amount in card (day_1 + day_2 + ... + day_n)/n * rate
        // Interest amount will be counted at the end of month

        // if amount > 0: Deposit else Withdraw
        dept += (currentAmount < 0) ? currentAmount : 0;
        currentAmount += amount;
    }

    public static void calculateInterest() {
        // Calculate interest
        double interest = dept * rate / 30;
        currentAmount += interest;
        dept = 0;
    }

    public static void countDept(Map<Integer, Double> setCheckout) {
        for (int i = 1; i <= timeToCount; i++) {
            if (setCheckout.containsKey(i)) {
                // if amount > 0: Deposit else Withdraw
                doTransaction(i, setCheckout.get(i));
                setCheckout.remove(i);
            } else {
                // if amount > 0: Deposit else Withdraw
                doTransaction(i, 0);
            }

            // if the day > 31, 61, 91,... will consider a month
            if (i == currentMonth) {
                calculateInterest();
                currentMonth += 30;
            }
        }
    }

    static class InputReader {
        StringTokenizer tokenizer;
        BufferedReader reader;
        String token;
        String temp;

        public InputReader(InputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public InputReader(FileInputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    if (temp != null) {
                        tokenizer = new StringTokenizer(temp);
                        temp = null;
                    } else {
                        tokenizer = new StringTokenizer(reader.readLine());
                    }
                } catch (IOException e) {
                }
            }
            return tokenizer.nextToken();
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}


