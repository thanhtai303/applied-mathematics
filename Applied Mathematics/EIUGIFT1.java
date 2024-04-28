import java.io.*;
import java.util.*;

class EIUGIFT1 {
    static InputReader sc = new InputReader(System.in);

    public static void main(String[] args) {
        var numberOfGift = sc.nextInt();
        var numberOfPaper = sc.nextInt();
        List<Integer> gifts = new ArrayList<>();
        for (var i = 0; i < numberOfGift; i++) {
            gifts.add(sc.nextInt());
        }
        var count = 0;
        gifts.sort(s1, s2 -> s2 - s1);
        for (var i = 0; i < numberOfPaper; i++) {
            var paper = sc.nextInt();
            for (var j = gifts.size() - 1; j >= 0; j--) {
                if (paper >= gifts.get(j) * 2 && paper <= gifts.get(j) * 3) {
                    count++;
                    gifts.remove(j);
                }
            }
        }
        System.out.println(count);
    }

    public static boolean test(int paper, int[] gifts) {
        for (var i = gifts.length - 1; i >= 0; i--) {
            if (paper >= gifts[i] * 2 && paper <= gifts[i] * 3) {
                return true;
            }
        }
        return false;
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
