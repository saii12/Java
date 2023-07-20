package confirm.ch04;

public class Test2 {

	public static void main(String[] args) {
		
		String grade = "B";
		 
		 int score = switch (grade) {
			 case "A" -> 100;
			 case "B" -> {
				 int result = 100 - 20;
				 yield result;
			 }
			 default -> 60;
			};
			
			System.out.println(score);
	}
}

//실행문 2개 이상이면 중괄호
//실행문 1개이면 중괄호 생략 가능