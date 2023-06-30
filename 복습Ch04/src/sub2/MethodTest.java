package sub2;

public class MethodTest {

	int num = 1;
	
	public static void main(String[] args) {
		
		int y1 = f(1);
		
		int y2 = f(2);
		
		int y3 = f(3);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		int t1 = sum(1, 10);
		int t2 = sum(1, 100);
		
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		
	}
	
	public static int f(int x) { //return 값 int니까 메서드 타입 int
		int y = 2 * x + 3;
		return y;
	}
	
	public static int sum(int start, int end) {
		
		int total = 0;
		for(int k=start ; k<=end ; k++ ) {
			
			total += k;
		}
		
		return total;
	}
}
