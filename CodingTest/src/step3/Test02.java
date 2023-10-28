package step3;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inPutCount = sc.nextInt();
		
		// 배열 생성 / []안에 값 무조건 넣어야하네, 들어간 값이 배열의 길이를 나타내는건가??
		int[] values = new int[inPutCount]; // for문 밖에서 생성해줘야 모든 for문에서 참조가능 		
		
		for(int i=0 ; i<inPutCount ; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			// 각 라운드마다 배열 요소로 저장
			values[i] = a + b;
		}
		
		for(int i=0; i<inPutCount ; i++ ) {
			
			// 배열 0번 요소부터 반복해서 출력
			System.out.println(values[i]);
		}
	}
}
