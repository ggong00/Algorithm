import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static int N;
    static int[] dp;
    static int cnt_rc, cnt_dp = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
        rc(N);
        dp(N);

        System.out.println(cnt_rc + " " + cnt_dp);
    }

    //재귀
    static int rc(int a) {
        if(a == 1 || a == 2) {
            cnt_rc++;
            return 1;
        }

        return rc(a - 1) + rc(a - 2);
    }

    //dp
    static int dp(int a) {
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= a; i++) {
            cnt_dp++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[a];
    }
}



