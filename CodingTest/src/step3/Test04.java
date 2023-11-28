package step3;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 총 금액
		int a = sc.nextInt();
		
		// 종류의 수
		int inputCount = sc.nextInt();
		// 배열 생성
		int[] values = new int [inputCount];
		
		// sum 변수 참조하기 위해 선언해주기
		int sum = 0;
		
		for(int i=0 ; i<inputCount ; i++) {
			
			int b = sc.nextInt();
			int c = sc.nextInt();
			values[i] = b * c;
		}
		
		for(int i=0 ; i<inputCount ; i++) {
			sum += values[i];
		}
		
		if(a == sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
