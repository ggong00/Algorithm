import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int[] table;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        table = new int[N];

        for (int i = 0; i < N; i++) {
            table[i] = Integer.parseInt(st.nextToken());
        }

        //병합정렬
        Arrays.sort(table);

        for (int i = 1; i < N; i++) {
            table[i] = table[i-1] + table[i];
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += table[i];
        }

        System.out.println(sum);
    }
}
