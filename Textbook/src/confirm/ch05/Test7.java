package confirm.ch05;

public class Test7 {

	public static void main(String[] args) {
		// 7번
		int[] array = { 1, 5, 3, 8, 2 };
		
		int maxNum = array[0];
		
		for(int num : array) {
			
			if(maxNum < num) {
				maxNum = num;
			}
		}

		System.out.println(maxNum);
	}
}
