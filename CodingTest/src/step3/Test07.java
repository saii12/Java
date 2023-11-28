package step3;

import java.util.Scanner;

public class Test07 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputCount = sc.nextInt();
		
		int[] values = new int[inputCount];
		
		
		for(int i=0 ; i<inputCount ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			values[i] = a + b;
			
		}
		
		for(int i=0 ; i<inputCount ; i++) {
			
			System.out.println("Case #" + (i+1) + ": " + values[i]);
		}
	}
}
