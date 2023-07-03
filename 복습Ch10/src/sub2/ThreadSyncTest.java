package sub2;

public class ThreadSyncTest {

	public static void main(String[] args) throws InterruptedException  {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start();
		ct2.start();
		ct3.start();
		
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("count값 : " + count.getNum());
	}
}
