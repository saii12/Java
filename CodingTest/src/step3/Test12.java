package step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> results = new ArrayList<>(); // int의 클래스 형태인 Integer로
		
		while(sc.hasNext()) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int result = a + b;
			results.add(result);
			
		}
		
		sc.close();
		
		for(int result : results) { 
			
			System.out.println(result);
		}
		
	}
	
	
	
}