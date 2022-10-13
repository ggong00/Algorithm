import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int input = Integer.parseInt(br.readLine());
            if (index < input) {
                for (int j = index + 1; j <= input; j++) {
                    stack.push(j);
                    sb.append("+" + "\n");
                }

                index = input;
            } else if (stack.peek() != input) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-" + "\n");
        }
        System.out.println(sb.toString());
    }
}
