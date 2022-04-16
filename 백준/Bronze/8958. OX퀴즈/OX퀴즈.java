import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			int sum = 0;
			int stack =0;			
			String str = br.readLine();
			char[] ch = str.toCharArray();
			
			for(int j =0; j<ch.length; j++) {
				
				if(ch[j] == 'O') {
					stack +=1;
					sum += stack;
					
				}else
				if(ch[j] == 'X') {
					stack =0;
					
				}	
			}
			
			bw.write(sum + "\n");
		}		
		bw.flush();
		bw.close();
	}	
}


