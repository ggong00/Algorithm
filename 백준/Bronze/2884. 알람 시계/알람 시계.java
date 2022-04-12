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
		
		String time = br.readLine();
		StringTokenizer token = new StringTokenizer(time," ");

		int hour = Integer.parseInt(token.nextToken());
		int minute = Integer.parseInt(token.nextToken());
		int totalMinute = hour * 60 + minute;
		
		if(totalMinute >= 45) {
			totalMinute -= 45;
			hour = totalMinute / 60;
			minute = totalMinute % 60;
			System.out.print(hour + " " + minute);
		
		}else {
			totalMinute += 1395;
			hour = totalMinute / 60;
			minute = totalMinute % 60;
			System.out.print(hour + " " + minute);

		}
			
	}
		
}