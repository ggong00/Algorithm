import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Main {
	

	public static void main(String[] args) throws IOException {
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=0; i<n; i++) {
			
			String str = br.readLine();
			
			if(test(str) == true) {
				
				count +=1;
			}	
		}
		System.out.println(count);
	}
	
	static boolean test(String str) {
		
		HashSet<Character> h = new HashSet<>();
					
		h.add(str.charAt(0));	
		char k = str.charAt(0);
			
		for(int i =0; i<str.length(); i++) {
			
			if(str.charAt(i) != k  ) {
				
				if(h.contains(str.charAt(i))) {
					return false;
				}else {
					h.add(str.charAt(i));
					k = str.charAt(i);
				}
				
			}
			
			
		}	
		
		return true;
	}
	
	
}
