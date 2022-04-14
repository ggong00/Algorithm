
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		int k = n;
		int sycle = 0;
		
		while(n != k || sycle ==0) {
			k = ((k %10) *10) + ((k/10 + k%10)%10);
			sycle +=1;
		}
		System.out.println(sycle);
	}
}
	
