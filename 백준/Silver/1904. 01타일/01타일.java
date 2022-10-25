import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dp;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[N + 2];
        dp[1] = 1;
        dp[2] = 2;
        System.out.println(dp(N));
    }

    static int dp(int n) {
        for (int i = 3; i <= n; i++) {

            dp[i] = (dp[i - 2] + dp[i - 1]) % 15746;
        }

        return dp[n];
    }

}



