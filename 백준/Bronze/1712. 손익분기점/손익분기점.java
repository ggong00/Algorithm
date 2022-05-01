import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	

	public static void main(String[] args) throws IOException {
	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int fixCost = Integer.parseInt(st.nextToken());
		int variableCost = Integer.parseInt(st.nextToken());
		int sellCost = Integer.parseInt(st.nextToken());
		
		int sellCount = 0;
		
		if(variableCost > sellCost || fixCost != 0 && variableCost == sellCost) {
			sellCount = -1;
		}else {
			sellCount = fixCost/(sellCost-variableCost);
			sellCount +=1;
		}
		System.out.println(sellCount);
		
	}
}

	


