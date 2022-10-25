import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] in;
    static int[] dx;
    static int[] dy;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //동 서 남 북
        dx = new int[]{1, -1, 0, 0};
        dy = new int[]{0, 0, -1, 1};

        st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        in = new int[x][y];

        //초기화
        for (int i = 0; i < x; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < y; j++) {
                in[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //bfs
        Queue<Node> queue = new LinkedList<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (in[i][j] == 1) {
                    queue.add(new Node(i, j));
                }
            }
        }
        int resultDay = bfs(queue);

        //0인 값 찾기
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (in[i][j] == 0) {
                    resultDay = -1;
                }
            }
        }

        System.out.println(resultDay);
    }

    static int bfs(Queue queue) {
        int day = 0;

        while (!queue.isEmpty()) {
            Node node = (Node) queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if (checkIdx(nx,ny) && in[nx][ny] == 0) {
                    in[nx][ny] = in[node.x][node.y] + 1;
                    day = in[nx][ny];
                    queue.add(new Node(nx,ny));
                }

            }
        }

        return day == 0 ? 0 : day - 1;
    }

    static boolean checkIdx(int x, int y) {
        return x >= 0 && x < in.length && y >= 0 && y < in[0].length;
    }

}

class Node {
    public int x;
    public int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}



