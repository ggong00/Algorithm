import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for (int i =0; i<A; i++) {
			int k = Integer.parseInt(st2.nextToken());
			if( k < X) {	
				pw.print(k + " ");
				
			}	
		}
		pw.flush();
		pw.close();

	}
}
	