package sub1;

import java.util.Scanner;

public class Test1복습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=1 ; i<=a ; i++) {
			
			for(int j=a-1 ; j>= i ; j--) {
				System.out.print(" "); // i가 증가할 때 공백이 출력되는 개수는 줄어야 하는데, 만약 조건식이 j<=i 이런 꼴이면 오히려 개수가 증가한다. 따라서 j>=i 꼴이 와야한다 이 때 증감식은 --가 와야함(+이면 조건 항상 참이됨)
			}
			
			for(int k=1 ; k<= i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
