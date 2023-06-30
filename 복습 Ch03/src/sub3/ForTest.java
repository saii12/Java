package sub3;

public class ForTest {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("i : " + i);
		}
		
		int sum = 0;
		
		for(int k = 1; k <= 10; k++) {
			
			sum += k ;
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		int tot = 0;
		
		for(int k = 0; k <= 10; k++) {
			
			if(k % 2 == 0) {
				
				tot += k;
			}
		}
		
		System.out.println("1부터 10까지 짝수합 : " + tot); // for문 끝나고 출력
	}
}