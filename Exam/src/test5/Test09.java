package test5;

/* 날짜 : 2023/07/17
 * 이름 : 박한산
 * 내용 : 자바 총정리 연습문제
 */
public class Test09 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=0 ; i<7 ; i++) {
			
			if(i <= 3)
				count++;
			else
				count--; // i가 4되면 count가 4에서 5가 되는 게 아니라 --로 3이 됨ㅉ
			
			for(int j=1 ; j<5-count ; j++) // j=1 , 2, 3이 만족하면서 별 세개 출력
				System.out.print("☆");
			
			for(int k=1 ; k<=count*2-1 ; k++) // 첫라운드에서는 k=1이 만족, 2라운드에서는 k=1, 2, 3이 만족 / 연필 잡고 그려가면서 해야함
				System.out.print("★");
			
			for(int j=1 ; j<5-count ; j++)
				System.out.print("☆");
			
			System.out.print("\n");
		}
		
		System.out.print("\n");
	}
}
