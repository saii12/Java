package step1;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt(); // int a int b로 하니까 나눴을때 정수까지만 나옴 ex) 5 / 2 했을 때 2.5가 아니라 2 나옴
		
				
		System.out.println(a / b); 
	}
}
