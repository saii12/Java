package step3;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = a / 4;
		
		for(int i=0; i<b; i++) {
			System.out.print("long "); // '' 작은따옴표는 왜 오류지??
		}
		
		System.out.print("int");
	}
}
