import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		String str = br.readLine();
		
		for (int i=0; i<str.length(); i++) {
			char k = str.charAt(i);
			
			if(k >= 'A' && k<='C') {	
				sum+=3;
				
			}else if(k >= 'D' && k<='F' ) {
				sum+=4;
				
			}else if(k >= 'G' && k<='I' ) {
				sum+=5;
				
			}else if(k >= 'J' && k<='L' ) {
				sum+=6;
				
			}else if(k >= 'M' && k<='O' ) {
				sum+=7;
				
			}else if(k >= 'P' && k<='S' ) {
				sum+=8;
				
			}else if(k >= 'T' && k<='V' ) {
				sum+=9;
				
			}else if(k >= 'W' && k<='Z' ) {
				sum+=10;
				
			}
		}
		System.out.println(sum);
	
		
		
	}
}