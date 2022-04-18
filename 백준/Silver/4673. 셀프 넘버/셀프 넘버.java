import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		test a = new test();
		boolean[] bo = new boolean[10001];
		
		for(int i=0; i<10001; i++) {
			int n = a.a(i);	
			if(n < 10001) {
			bo[n] = true;
			}
		}	
		for(int i=0; i<bo.length; i++) {
			if(bo[i] == false) {
			bw.write(i +"\n");
			}
		}
		
		bw.flush();
		bw.close();
		
	}	
}

class test {
	
	int a(int i) {
		int sum = i;
		
		while(i != 0) {
			sum += i%10;
			i = i/10;
		}
		return sum;
	}
}
