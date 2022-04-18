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
		Test test = new Test();
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (test.test1(i) == 1) {
				count += 1;
			}
			
		}
		System.out.println(count);
	}
}

class Test {

	int test1(int a) {
		if(a < 100) {
			
			return 1; 
			
		}else   
		if(a >= 100 && a <1000 ) {
			int a1 = a%10;
			int a10 = (a/10)%10;
			int a100 = (a/100);
			
			if(a100-a10 == a10-a1) {	
			return 1; 
		    }
		}
		
		return 0;
	}	
}