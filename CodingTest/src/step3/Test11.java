package step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> results = new ArrayList<>(); // int의 클래스 형태인 Integer로
		
		while(true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			
			if(a == 0 && b == 0) {
				break; // 여기서 while문 끝나니까 0은 List에 추가 안됨
			}
			
			int result = a + b;
			results.add(result);
			
		}
		
		for(int result : results) { // while문 안에 result를 참조할 수 없다
			
			System.out.println(result);
		}
		
	}
	
	
	
}