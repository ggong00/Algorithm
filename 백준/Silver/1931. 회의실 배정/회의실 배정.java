import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node {
    int start;
    int end;

    Node(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Main {
    static int N;
    static Node[] table;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        table = new Node[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            table[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(table, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.end != o2.end) {
                    return o1.end - o2.end;
                }
                return o1.start - o2.start;
            }
        });

        System.out.println(solution());
    }

    static int solution() {
        int count = 0;
        int curTime = 0;

        for (Node nextNode : table) {

            if (nextNode.start >= curTime) {
                curTime = nextNode.end;
                count++;
            }
        }

        return count;
    }
}
