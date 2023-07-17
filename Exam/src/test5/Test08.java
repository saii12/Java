package test5;

/* 날짜 : 2023/07/17
 * 이름 : 박한산
 * 내용 : 자바 총정리 연습문제
 */
public class Test08 {

	public static void main(String[] args) {
		
		for(int y=1 ; y<=9 ; y++) { // 꼭 x로 쓸 필요는 없네, 출력할 때 생각하기 편하게 y로 잡는 게 낫다
			for(int x=2 ; x<=9 ; x++) {
				System.out.printf("%d x %d = %2d\t", x, y, x*y); // \t는 탭, %2d는 2자리 지정 통해서 결과값 오른쪽 정렬
			}
			System.out.print("\n"); // \n, \t 등등 큰따옴표 있어야함
		}
	}
}
