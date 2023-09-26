package sub1;

/* 날짜 : 2023/07/03
 * 이름 : 박한산 
 * 내용 : Java Thread 실습하기
 * 
 * 스레드(Thread)
 *  - 하나의 프로세스 안에서 실행되는 프로그램 실행흐름
 *  - 스레드는 동시에 실행되는 병행 실행
 *  - Thread 클래스를 상속 받아 start 실행
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		// 스레드 객체 생성
		SubThread st1 = new SubThread("sub1");
		SubThread st2 = new SubThread("sub2");
		
		// 자식 스레드 실행
		st1.start(); // sub1 스레드 생성
		st2.start(); // sub2 스레드 생성
		
		for(int i=0 ; i<10 ; i++) { // main 스레드 실행, Top down 하면서 3개 스레드 동시에 실행됨
			
			try {
				// 1초 대기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Main Thread 실행...");
			
		}
		
		System.out.println("Main Thread 종료...");
		}
}