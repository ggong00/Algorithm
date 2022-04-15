import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st; 
		int[] arr = new int[9];
		arr[0] = Integer.parseInt(br.readLine());
		int max = arr[0];
		int maxindex = 0;
		for (int i =1; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] > max) {
				max = arr[i];
				maxindex = i;		
			}
		}
		System.out.println(max);
		System.out.println(maxindex+1);

	}	
}
	