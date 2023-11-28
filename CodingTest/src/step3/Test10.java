package step3;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputCount = sc.nextInt();
		
		for(int i=0 ; i<inputCount ; i++) {
			
			// i=0일때 k= 4, 3, 2 ,1 만족 i=1이면 k=4, 3, 2 만족
			for(int k=inputCount-1 ; k>i ; k--) { // 예제 기준으로 int k=4 이렇게 풀면 안되지!
				
				System.out.print(" ");
			}
			
			for(int k=0 ; k<=i ; k++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
