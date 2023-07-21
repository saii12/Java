package confirm.ch08;

interface Remocon {
	public void powerOn();
}

class TV implements Remocon {

	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다."); //Remocon 인터페이스의 powerOn 메서드 재정의
	}
	

}

public class Test5 {
	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
	}

}
