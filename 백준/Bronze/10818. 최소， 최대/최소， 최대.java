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
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int max = -1000001; 
		int min = 1000001;
		
		for(int i =0; i<n; i++) {
			
			int a = Integer.parseInt(st.nextToken());
			if(max < a) {
				max = a;
			}
			if(min > a) {
				min = a;
			}	
		}
		System.out.println(min + " " + max);
	}
}
	
