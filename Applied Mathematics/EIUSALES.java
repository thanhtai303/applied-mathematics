import java.util.*;
import java.io.*;

class EISALE {
    static InputReader reader = new InputReader(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        int[] level = { 2000, 500, 200, 50, 20, 0 };
        double[] bonus = { 0.07, 0.06, 0.05, 0.04, 0.03, 0.02 };

        int products = reader.nextInt();
        double totalBonus = 0;
        for (var i = 0; i < level.length; i++) {
            if (products > level[i]) {
                totalBonus += (products - level[i]) * bonus[i];
                products = level[i];
            }
        }
        System.out.printf("%.3f", totalBonus);
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
