import java.io.*;
import java.util.*;

class EIAPP21222FQ3 {
    static InputReader reader = new InputReader(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        double amount = reader.nextDouble();
        int nMonth = reader.nextInt();
        System.out.printf("%.4f", solve(amount, nMonth));
    }

    public static double solve(double amount, int nMonth) {
        double high = amount / nMonth;
        double low = 0;
        double middle = 0;
        while (high - low > 0.0001) {
            middle = (high + low) / 2;
            if (countMoney(middle, nMonth) == amount) {
                return countMoney(middle, nMonth);
            }
            if (countMoney(middle, nMonth) > amount) {
                high = middle;
            } else {
                low = middle;
            }
        }
        return middle;
    }

    static double[] interests = {0, 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664, 0.0692};

    public static double countMoney(double amount, int nMonth) {
        double tempAmount = 0;
        for (int i = nMonth; i > 0; i--) {
            tempAmount += calculate(amount, i);
        }
        return tempAmount;
    }

    static double calculate(double amount, int month) {
        var year = month / 12;
        amount = amount * Math.pow(1 + interests[12], year);
        month = month % 12;
        amount = amount * (1 + interests[month] / 12 * month);
        return amount;
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

