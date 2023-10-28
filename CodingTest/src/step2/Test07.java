package step2;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//  Math 클래스를 사용하여 최대값 구하기(b, c 중에 최대값을 구하고 a와 다시 비교)
		int max = Math.max(a, Math.max(b, c));
		
	
		if(a == b & a == c) { // &랑 && 차이가 뭐지??
			System.out.println(10000 + a * 1000);
		} else if(a == b || a == c || b == c) {
			
			if( a == b) {
				System.out.println(1000 + a * 100);
			}
			if( a == c) {
				System.out.println(1000 + a * 100);
			}
			if( b == c) {
				System.out.println(1000 + b * 100);
			}
			
		}else {
			System.out.println(max * 100);
		}
	
	}
	

}