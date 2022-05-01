import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	

	public static void main(String[] args) throws IOException {
	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num = Integer.parseInt(br.readLine());
		int x = 1;
		
		int i = 1;
		while(true) {
			if(num == 1 ) {
				System.out.println(num);
				break;
			}else
			if(num> x && num <= 6*i + x) {
				System.out.println(i+1);
				break;
			}else {
				x = 6*i + x;
				i++;
			}
		}
	}
}

	