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
		int a[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = 0;
		double avr = 0;
		
		for(int i= 0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			if(a[i] > max) {
				max = a[i];
			}
		}
		for(int i=0; i<n; i++) {
			 avr += (double)a[i]/max*100; 
		}
		avr = avr/n;
		bw.write(avr +"");
		bw.flush();
		bw.close();
	}	
}
	