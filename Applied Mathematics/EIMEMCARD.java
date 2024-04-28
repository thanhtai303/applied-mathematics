import java.util.*;
import java.io.*;

class EIMEMCARD {
    static InputReader reader = new InputReader(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        solve();
        System.out.println(sb);
    }

    public static void solve() {
        double[] level = { 0, 1000000, 20000000, 50000000, 200000000 };
        double[] classes = { 0, 0.02, 0.03, 0.05, 0.07 };

        int products = reader.nextInt();
        int currentLevel = 0;
        int totalAmount = 0;
        for (var i = 0; i < products; i++) {
            double amount = reader.nextDouble();
            double discount = amount * classes[currentLevel];
            totalAmount += amount;
            for (var j = currentLevel; j < level.length; j++) {
                if (totalAmount >= level[j]) {
                    currentLevel = j;
                }
            }
            sb.append(discount).append(" ");
        }
    }
}

class InputReader {
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
