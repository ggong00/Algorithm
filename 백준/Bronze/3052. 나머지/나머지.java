import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean a[] = new boolean[42];
		
		for(int i =0; i<10; i++) {
			a[Integer.parseInt(br.readLine()) % 42] = true;

		}
		int count =0;
		for(int i=0; i<a.length; i++ ) {
			if(a[i] == true) {
				count +=1;
			}
		}	
		bw.write(count+"");
		bw.flush();
		bw.close();	
	}	
}
	
