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
		
		String str = br.readLine();
		int[] n = new int[26];
	
		for(int i=0; i<str.length(); i++) {
	
			
			if('A' <=str.charAt(i) && str.charAt(i) <= 'Z') {
				
				n[str.charAt(i) -'A'] += 1;
			}
			else {
				
				n[str.charAt(i) - 'a'] += 1;
			}
		}
		int max = -1;
		char ch = '?';
		for(int i=0; i<n.length; i++) {
			if(n[i] > max) {
				max = n[i];
				ch = (char) (i + 'A');
			}
			else if(n[i] == max) {
				ch = '?';
			}
		}	
		
		bw.write(ch);
		bw.close();
	}
}
