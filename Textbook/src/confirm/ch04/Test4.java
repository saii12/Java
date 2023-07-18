package confirm.ch04;

public class Test4 {

	public static void main(String[] args) {
		
		
		
		
		while(true) {
			int num1 = (int) Math.ceil(Math.random() * 6); // While 문 안에 들어가야 반복하면서 난수가 바뀌지! 밖에서 하는 게 아니고
			int num2 = (int) Math.ceil(Math.random() * 6);
			
			System.out.println("("+num1+","+num2+")");
			
			int tot = num1 + num2;
			if(tot == 5) {
				break;
			}
		}
	}
}
