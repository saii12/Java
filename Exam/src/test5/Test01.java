package test5;

/* 날짜 : 2023/07/17
 * 이름 : 박한산
 * 내용 : 자바 총정리 연습문제
 */
public class Test01 {

	public static void main(String[] args) {
		
		char a = 'A';
		int b = a; // 문자 A는 아스키코드로 65 나옴(정수로 나옴)
		char c = 66; // 66이라는 숫자는 문자로 나옴
		int d = a + b;
		
		System.out.println("a :  " + a);
		System.out.println("b :  " + b);
		System.out.println("c :  " + c);
		System.out.println("d :  " + d);
		
		float n1 = 3.1415922653589793f;
		double n2 = 3.1415922653589793d;
		
		int n3 = (int) n1; //큰범위 float에서 작은 범위int로 바꾸니까 캐스팅해줘야함 
		int n4 = (int) n2;
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("n4 : " + n4);
		
		String str1 = "홍길동";
		String str2 = null;
		String str3 = "Hello\n" // \n없으면 옆으로 붙어서 나옴
					+ "World\n"
					+ "Korea";
		String str4 = """ 
							 Hello
							 World
							 Korea
							"""; // 큰따옴표 3개는 작성된 그대로 문자열로 저장
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
	}
}
