package sub1;

public class Test2 {

	public static void main(String[] args) {
		
		int a = 4;
		
		for(int i=1 ; i<=a; i++) {
			
			for(int k=a-1 ; k>=i ; k-- ) {
				System.out.print("☆");
			}
			
			for(int j=1 ; j<=i*2-1 ; j++) {
				System.out.print("★");
			}
			
			for(int k=a-1 ; k>=i ; k-- ) {
				System.out.print("☆");
			}
			
			System.out.println();
		}
	}
}
