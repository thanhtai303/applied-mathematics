import java.util.*;
import java.io.*;

class EIPAIR {
    static InputReader sc = new InputReader(System.in);
    static StringBuffer sb = new StringBuilder();

    public static void main(String[] args) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long count = 0;
        for (var i = 0; i < n; i++) {
            long p = sc.nextLong();
            if (p > count && p <= k) {
                count = p;
            }
        }
        System.out.println(p);
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
}
