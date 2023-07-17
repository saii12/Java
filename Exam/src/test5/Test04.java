package test5;

/* 날짜 : 2023/07/17
 * 이름 : 박한산
 * 내용 : 자바 총정리 연습문제
 */
public class Test04 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		System.out.println(a > b && a == 10);
		System.out.println(a > b && a == b);
		
		System.out.println(a > b || a == b);
		System.out.println(a > b && a == b);
		
		System.out.println(a > b ^ a == 10); //XOR 두 결과 같으면 0(false), 다르면 1(true)
		System.out.println(a > b ^ a == b); // true ^ false -> true
		System.out.println(true ^ false);
		
		System.out.println(!(a > b));
		System.out.println(!(a < b));
	}
}
