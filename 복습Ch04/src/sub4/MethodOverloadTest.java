package sub4;

public class MethodOverloadTest {
	
	public static void main(String[] args) {
		
		
		int r1 = plus(1);
		int r2 = plus(1, 2);
		double r3 = plus(1.1, 2.3);
		String r4 = plus("Hello", "World");
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
	}
	
	public static int plus(int a) { // 동일한 이름의 메서드를 매개변수로 구분, 반환타입은 상관X
		return a + a;
	}
	
	public static int plus(int a, int b) {
		return a + b;
	}
	
	public static double plus(double a, double b) {
		return a + b;
	}
	
	public static String plus(String a, String b) {
		return a + b;
	}
}