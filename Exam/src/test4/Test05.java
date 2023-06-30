package test4;

/* 날짜 : 2023/06/30
 * 이름 : 박한산
 * 내용 : String, Wrapper 클래스 연습문제
 * 
 */
public class Test05 {

	public static void main(String[] args) {
		
		String strCsv = "60,72,82,86,92"; // ,하고 띄우면 안 됨 split',' 이걸로 구분하니까
		String[] scores = strCsv.split(",");
				
		int total = 0;
		
		for(int i=0 ; i<scores.length ; i++) {
			
			total += Integer.parseInt(scores[i]);
					
		}
		
		System.out.println("총점 : " + total);
	}
}
