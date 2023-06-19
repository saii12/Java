package sub1;

/*
 * 날짜 : 2023/06/19
 * 이름 : 박한산
 * 내용 : Java 클래스 실습하기
 */
public class ClassTest {

	public static void main(String[] args) {
		
		
		//객체(Object) 생성
		Car sonata = new Car(); //자료형 타입 Car
		
		// 객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		//객체 활용
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		//객체 선언 ,생성, 초기화
		Car avante; //선언
		avante = new Car(); // 생성
		avante.name = "아반떼";
		avante.color = "검은색";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(40);
		avante.show();
		
		//Account 객체생성과 초기화
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id = "101-21-0101";
		kb.name = "김유신";
		kb.balance = 10000;
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
		
		//Account 객체 생성과 초기화, 응용
		Account wr = new Account(); //총 변수 선언 4개 :sonata avante kb wr
		wr.bank = "우리은행";
		wr.id = "101-21-0102";
		wr.name = "김춘추";
		wr.balance = 1000;
		
		wr.deposit(30000);
		wr.withdraw(5000);
		wr.show();
		
		
		
		
	}
}
