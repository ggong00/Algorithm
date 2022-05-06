import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {
	

	public static void main(String[] args) throws IOException {
	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int after = Integer.parseInt(st.nextToken());
		int night = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int count = 1;
		m = m-after;
		
		double a = (double)m/(after -night);
		int b = m/(after -night);
	
		if(a>b) {
			count += b+1;
			
		}else {
			count+= b;
		}
	
		System.out.println(count);
	}
}
