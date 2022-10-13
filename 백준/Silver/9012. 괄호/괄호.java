import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            sb.append(solution(br.readLine()) + "\n");
        }

        System.out.println(sb.toString());
    }

    public static String solution(String input) {
        Stack<Character> stack = new Stack<>();

        for (char at : input.toCharArray()) {
            if (at == '(') {
                stack.push(at);
            } else if (stack.isEmpty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}



