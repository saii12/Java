package sub1;

public class ThreadTest {

	public static void main(String[] args) {
	
		SubThread st1 = new SubThread("sub1");
		SubThread st2 = new SubThread("sub2");
		
		st1.start();
		st2.start();
		
		for(int i=0 ; i<10 ; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Main Thread 실행...");
		}
																																																					
		System.out.println("Main Thread 종료...");
	}
}
