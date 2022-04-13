import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] atob = new int[num*2];
		for(int i=0; i<atob.length; i += 2 ) {
			atob[i] = sc.nextInt();
			atob[i + 1] = sc.nextInt();
		}
		for(int i=0; i<atob.length; i += 2) {
			int total = atob[i] + atob[i + 1];
			System.out.println(total);
			
		}
		
	}
		
}
	
