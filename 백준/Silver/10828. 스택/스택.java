import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Stack stack = new Stack();

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            String nextCommand = st.nextToken();
            Integer result = null;

            if (nextCommand.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));

            } else if (nextCommand.equals("pop")) {
                result = stack.pop();

            } else if (nextCommand.equals("size")) {
                result = stack.size();

            } else if (nextCommand.equals("empty")) {
                result = stack.empty();

            } else if (nextCommand.equals("top")) {
                result = stack.top();
            }

            if (result != null) {
                sb.append(result + "\n");
            }

        }
        System.out.println(sb.toString());
    }

    static class Stack {
        private int pointer = -1;
        private final int[] stack = new int[10000];

        public void push(int value) {
            stack[++pointer] = value;
        }

        public int pop() {
            if (pointer == -1) {
                return -1;
            }

            return stack[pointer--];
        }

        public int size() {
            return pointer + 1;
        }

        public int empty() {
            return pointer == -1 ? 1 : 0;
        }

        public int top() {
            if (pointer == -1) {
                return -1;
            }

            return stack[pointer];
        }
    }
}



