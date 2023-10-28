package step2;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// b + c 를 60으로 나눈 몫을 a(시)에 더하고 24 이상인 경우를 고려하여 24로 나눈 나머지로 나오게
		System.out.println((a + (b + c) / 60) % 24 + " " + (b + c) % 60);
		
	}
}
