package sub2;

/*
 * 날짜 : 2023/06/27
 * 이름 : 박한산
 * 내용 : Java StringBuilder 클래스 실습하기
 * 
 */

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// String immutable 특성
		String str = "Java";
		System.out.println("str 객체주소 : " + System.identityHashCode(str));
		
		str += "Programming";
		System.out.println("str 객체주소 : " + System.identityHashCode(str));
		
		System.out.println("str : " + str);
		
		// String immutable 특성을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Java"); 
		System.out.println("sb 객체 주소 : " + System.identityHashCode(sb));
		
		sb.append("Programming"); // StringBuilder는 같은 메모리 주소에 입력됨
		System.out.println("sb 객체 주소 : " + System.identityHashCode(sb));
		
		System.out.println("sb : " + sb);
	}
}
