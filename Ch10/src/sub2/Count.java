package sub2;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	// 동기화 블럭 : 스레드간의 경합을 막고 동기방식으로 실행
	public synchronized void setNum() { // 세개의 스레드가 실행될 때 하나의 스레드만 진입될 수 있도록 동기화(순서) 해줘야함
		this.num++;
	}
}
