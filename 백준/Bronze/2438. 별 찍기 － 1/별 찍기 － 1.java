
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
	
		
		for(int i=0; i<n ; i++) {
			
			for(int j=0; j<=i; j++) {
				pw.printf("*");	
			}
			pw.printf("\n");
		}
		pw.flush();
		pw.close();
	}
}