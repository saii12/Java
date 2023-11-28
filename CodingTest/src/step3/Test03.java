package step3;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int sum = 0;
		
		for(int i=1 ; i<=k ; i++) {
			
			sum += i;
		}
		
		System.out.println(sum);
	}
}
