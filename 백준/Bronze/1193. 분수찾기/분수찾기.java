import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	

	public static void main(String[] args) throws IOException {
	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int n_ = 1; //분자
		int _n = 1; //분모
		
		num -= 1;
		
		//입력 값 만큼 for문을 돌린다.
	
			for (int i =0; i<num; i++) {
				
				//분자가 1이면서 분모와 분자의 합이 짝수이면 오른쪽으로 한칸 이동
				if(n_ ==1 && (_n + n_)%2 == 0) {
					_n +=1;
				}else
				//분모가 1이면서 분모와 분자의 합이 홀수이면 밑으로 한칸 이동	
				if(_n ==1 && (_n + n_)%2 == 1) {
				n_ +=1;
				
				}else 
				//분모와 분자의 합이 짝수일 경우 대각선 밑으로 한칸씩 이동	
				if((_n + n_)%2 == 0) {
					n_ -=1;
					_n +=1;
				}else 
				//분모와 분자의 합이 홀수일 경우 대각석 위로 한칸씩 이동	
				if((_n + n_)%2 == 1) {
					n_ +=1;
					_n -=1;
				}
	
			}
		
		System.out.println(n_ + "/" + _n);
		
		
	}
}

	

