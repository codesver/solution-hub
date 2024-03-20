import java.io.*;
import java.util.Arrays;

public class Main {

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    private final StringBuilder result = new StringBuilder();

    private void solve() throws IOException {
        int N = Integer.parseInt(reader.readLine());


        for (int m = Math.max(0, N - String.valueOf(N).length() * 9); m < N; m++) {
            int sum = m + Arrays.stream(String.valueOf(m).split(""))
                    .mapToInt(Integer::parseInt)
                    .sum();
            if (sum == N) {
                result.append(m);
                break;
            }
        }

        if (result.length() == 0) {
            result.append(0);
        }
    }

    private void submit() throws IOException {
        writer.write(result.toString());
        writer.flush();
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
        main.submit();
    }
}