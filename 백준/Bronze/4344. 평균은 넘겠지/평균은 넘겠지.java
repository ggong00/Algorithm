import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		//입력
		int n = Integer.parseInt(br.readLine());
		double total =0;
		//입력
		for(int i =0; i<n; i++) {
			int count =0;
			double sum = 0;
			st = new StringTokenizer(br.readLine() , " ");
			int nn = Integer.parseInt(st.nextToken());
			int[] array = new int[nn]; 
			for(int j=0; j<array.length; j++) {			
				array[j] = Integer.parseInt(st.nextToken()); 
				sum += array[j];
			}
			total = sum/nn;
			for(int c =0; c<array.length; c++) {
				if(array[c] > total) {
					count += 1;
				}

			}
			System.out.printf("%.3f%%\n" ,(double)count*100/nn);
		}
	
	}	
}