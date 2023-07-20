package test7;

/* 날짜 : 2023/07/20
 * 이름 : 박한산
 * 내용 : 자바 총정리 연습문제
 * 
 */

interface Tv {
	public void turnOn();
	public void turnOff();
}
		
public class Test09 {

	public static void main(String[] args) {
		
		Tv tv = new Tv() { //class 도움 없이 interface 객체를 바로 생성
			@Override
			public void turnOn() {
				System.out.println("Tv를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Tv를 끕니다.");
			}
		};
		
		tv.turnOn();
		tv.turnOff();
	}
}
