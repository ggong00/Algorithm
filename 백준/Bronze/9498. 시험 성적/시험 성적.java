import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int score = Integer.parseInt(br.readLine());
		
		if(score >= 90) {	
			System.out.println("A");
		}else
		if(score >= 80) {	
			System.out.println("B");
		}else
		if(score >= 70) {	
			System.out.println("C");
		}else
		if(score >= 60) {	
			System.out.println("D");
		}else {		
			System.out.println("F");	
		}
		
		
	}
	
}