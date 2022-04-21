import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int nn = Integer.parseInt(st.nextToken());   
			String str = st.nextToken();
			char[] ch = new char[str.length()];
			for(int j=0; j<ch.length; j++ ) {
				ch[j] = str.charAt(j);	
				for(int y=0; y<nn; y++) {
					bw.write(ch[j]);
				}
			}
		bw.write("\n");
		}
		bw.close();
		
	}
}
