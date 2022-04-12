
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String dice = br.readLine();
		String[] sArray = dice.split(" "); 
		int[] diceArray = new int[3];
		
		for(int i =0; i < diceArray.length; i++) {
			diceArray[i] = Integer.parseInt(sArray[i]);
		}
		for(int i =0; i < diceArray.length; i++) {
			for(int j =i + 1; j < diceArray.length; j++) {
				if (diceArray[i] < diceArray[j]) {
					int rp = diceArray[i];
					diceArray[i] = diceArray[j];
					diceArray[j] = rp;
				}
			}
		}
		
		if(diceArray[0] == diceArray[1] && diceArray[0] == diceArray[2]) {
			System.out.println(10000 + diceArray[1] * 1000);	
		}else 
		if(diceArray[0] != diceArray[1] && diceArray[1] != diceArray[2] ) {
			System.out.println(diceArray[0] * 100);
		}else {
			if(diceArray[0] == diceArray[1]) {
				System.out.println(diceArray[0] *100 + 1000 );
			}else
			if(diceArray[1] == diceArray[2]) {
				System.out.println(diceArray[1] *100 + 1000 );
			}	
			
		}	
		
	}
		
}
	
