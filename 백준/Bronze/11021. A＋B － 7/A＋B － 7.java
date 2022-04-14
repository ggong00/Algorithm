import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer token;
		
		for(int i=1; i<=n ; i++) {
			token = new StringTokenizer(br.readLine(), " ");
			int x =Integer.parseInt(token.nextToken());
			int y =Integer.parseInt(token.nextToken());
			int total= x+y;
			bw.write("Case #"+ i +": " + total  + "\n");
		}
		bw.flush();
		bw.close();
		
		
	}
	
}
	