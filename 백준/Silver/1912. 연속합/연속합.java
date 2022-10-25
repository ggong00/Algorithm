import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dp;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        dp = new int[N+1];
        System.out.println(dp(st,N));
    }

    static int dp(StringTokenizer st, int n) {
        dp[1] = Integer.parseInt(st.nextToken());
        int max = dp[1];

        for (int i = 2; i <= n; i++) {
            int a = Integer.parseInt(st.nextToken());
            dp[i] = Math.max(dp[i - 1] + a, a);
            max = Math.max(dp[i], max);
        }
        return max;
    }

}