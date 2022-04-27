import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	

	public static void main(String[] args) throws IOException {
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = 0;
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			
			char[] c = br.readLine().toCharArray(); 
			
		
			for(int j =0; j<c.length; j++) {
				if(j<c.length-1) {
					if(c[j] != c[j+1]) {
					
						for(int k = j+1; k < c.length; k++ ) {
							
							if(c[j] == c[k]) {
								k += 101;
								j += 101;
							}	
						}
						
					}
				}else { 
					count +=1;
				}
				
			}
		}
		System.out.println(count);


	}
}
