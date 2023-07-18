package confirm.ch03;

public class Test7 {

	public static void main(String[] args) {
		
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;
		if(Double.isNaN(z)) { // Double.isNan 은 Not a number라는 뜻, 숫자가 아니다(None) 값 참이므로 실행
			System.out.println("0.0으로 나눌 수 없습니다.");
		}else {
			double result = z + 10;
			System.out.println("결과 : " + result);
		}
	}
}
