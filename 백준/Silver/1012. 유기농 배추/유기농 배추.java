import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] in;
    static int[] dx;
    static int[] dy;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        //동 서 남 북
        dx = new int[]{1, -1, 0, 0};
        dy = new int[]{0, 0, -1, 1};

        for (int i = 0; i < N; i++) {
            int count = 0;
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            in = new int[x][y];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                in[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            for (int j = 0; j < x; j++) {
                for (int l = 0; l < y; l++) {
                    if (in[j][l] == 1) {
                        count++;
                        dfs(j,l);
                    }
                }
            }
            sb.append(count + "\n");
        }
        System.out.println(sb);
    }

    static void dfs(int x, int y) {
        in[x][y] = 0;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (checkIdx(nx,ny) && in[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }

    static boolean checkIdx(int x, int y) {
        return x >= 0 && x < in.length && y >= 0 && y < in[0].length;
    }

}