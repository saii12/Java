package test8;

/** 날짜 : 2023/07/21
 *  이름 : 박한산
 *	내용 : 자바 총정리 연습문제
 */
public class Test02 {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println("str1 역순 : " + reverseStr(str1));
		System.out.println("str2 역순 : " + reverseStr(str2));
	}
	
	public static String reverseStr(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=str.length()-1 ; i>=0 ; i--) {
			sb.append(str.charAt(i)); //charAt 은 문자열에서 문자 추출하는 것
		}
		
		return sb.toString();
	}
}
