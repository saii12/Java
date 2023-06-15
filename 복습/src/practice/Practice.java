package practice;

public class Practice {

	public static void main(String[] args) {
		
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		
	}
	
	public static int f(int x) {
		int y = x * 2 + 3;
		return y;
		
	}
}