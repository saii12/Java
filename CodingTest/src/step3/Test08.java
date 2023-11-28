package step3;

import java.util.Scanner;

public class Test08 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputCount = sc.nextInt();
		
		int[] values = new int[inputCount];
		
		// 2차원 배열 생성 / 배열의 행 개수, 열 개수 지정
		int[][] twoDimvalues = new int[inputCount][2];
		
		for(int i=0 ; i<inputCount ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			values[i] = a + b;
			
			// 2차원 배열의 i번행(0번행부터), 0번열
			twoDimvalues[i][0] = a;
			// 2차원 배열의 i번행, 1번열
			twoDimvalues[i][1] = b;
		}
		
		for(int i=0 ; i<inputCount ; i++) {
			
			System.out.println("Case #" + (i+1) + ": " + twoDimvalues[i][0] + " + " + twoDimvalues[i][1] + " = "  + values[i]);
		}
	}
}
