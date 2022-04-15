import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int total = a*b*c;
		
		String str = String.valueOf(total);
		char[] charr = str.toCharArray();
		int[] intarr = new int[10];
		
		for(int i=0; i<charr.length; i++) {
			for(int j=0; j<intarr.length; j++) {
				if(charr[i]-'0' == j) {
					intarr[j] = intarr[j]+1;  
				}
			}	
		}
		for(int i=0; i<intarr.length; i++) {
			bw.write(intarr[i]+"\n");
		}
		bw.flush();
		bw.close();
	}	
}
	
