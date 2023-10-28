package step2;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(y >= 45 && y <= 59) { // y가 45이상이고 56이하 : 이렇게 써야하넹
			System.out.println(x + " " + (y-45)); // y-45 괄호 씌워주기
		}else {
			
			if(x == 0) {
				System.out.println(23 + " " + (y+15));
				
			// else문 있을 때랑 없을 때랑 다름!(노션에 기록)
			}else {
				System.out.println((x-1) + " " + (y+15));
			}
				
		}
	}
}
