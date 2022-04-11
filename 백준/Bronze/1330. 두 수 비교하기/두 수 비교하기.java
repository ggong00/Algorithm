import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		//[A B]가 주어지고 두 수를 [비교]
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		
		StringTokenizer st = new StringTokenizer(input , " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if(A > B) {
			
			System.out.println(">");	
		}else
		if(A < B) {
				
			System.out.println("<");	
		}else	
		if(A == B) {
				
			System.out.println("==");	
		}
		

	}
	
}