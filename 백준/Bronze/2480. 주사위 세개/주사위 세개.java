import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String dice = br.readLine();
		StringTokenizer token = new StringTokenizer(dice," ");
		
		int a = Integer.parseInt(token.nextToken());
		int b = Integer.parseInt(token.nextToken());
		int c = Integer.parseInt(token.nextToken());
		int max = 0;
		
		if(a==b && b==c && a==c) {
			System.out.println(a*1000 + 10000);
			
		}else
		if(a==b || a==c) {
			System.out.println(a*100 + 1000);
			
		}else
		if(b==c) {
			System.out.println(b*100 + 1000);
			
		}else
		if(!(a==b && a==c && b==c)) {
			if(a>b && a>c) {
				max = a;
				System.out.println(a*100);
			}else
			if(b>a && b>c) {
				max = b;
				System.out.println(b*100);
			}else {
				System.out.println(c*100);
			}	
		
		}	
			
	}
		
}