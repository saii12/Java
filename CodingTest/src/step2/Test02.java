package step2;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a >= 90) { // 위에서 int a 로 자료형 써줬으니까 int 안 써도 됨
 			System.out.println("A");
		} else if(a >= 80) {
			System.out.println("B");
		} else if(a >= 70) {
			System.out.println("C");
		} else if(a >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
