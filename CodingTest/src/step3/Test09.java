package step3;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputCount = sc.nextInt();
		
		for(int i=0 ; i<inputCount ; i++) {
			
			for(int k=0 ; k<=i; k++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
