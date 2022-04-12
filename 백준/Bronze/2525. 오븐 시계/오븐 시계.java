
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String time = br.readLine();
		StringTokenizer token = new StringTokenizer(time," ");
		int grillMinute = Integer.parseInt(br.readLine()); 
		int hour = Integer.parseInt(token.nextToken());
		int minute = Integer.parseInt(token.nextToken());
		
		int totalMinute = hour * 60 + minute + grillMinute;
		
		if(totalMinute < 1440) {
			hour = totalMinute / 60; 
			minute = totalMinute % 60;
			System.out.println(hour + " " + minute);
	
		}else
		if(totalMinute >= 1440) {
			totalMinute -= 1440;
			hour = totalMinute / 60; 
			minute = totalMinute % 60;
			System.out.println(hour + " " + minute);

		}
			
	}
		
}