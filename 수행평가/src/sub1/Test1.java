package sub1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=1 ; i<=a ; i++) {
			
			for(int j=a-1 ; j>=i ; j--) {
				System.out.print(" ");
			}
			
			for(int k=1 ; k<=i ; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
