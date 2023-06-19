package sub2;

/*
 * 날짜 : 2023/06/19
 * 이름 : 박한산
 * 내용 : Java 캡슐화 실습하기
 */
public class EncapsuleTest {
	
	public static void main(String[] args) {
	
	// Car 객체 생성 초기화
	Car sonata = new Car("소나타", "흰색", 10);
	
	sonata.speedUp(80);
	sonata.speedDown(20);
	sonata.show();
	
	// Car 객체 생성 초기화
	Car avante = new Car("아반떼", "검은색", 10);
	avante.speedUp(60);
	avante.speedDown(20);
	avante.show();	
	
	// Account 객체 생성 초기화
	Account kb = new Account("국민은행", "101-12-1001", "김유신", 10000);
	kb.deposit(40000);
	kb.withdraw(25000);
	kb.show();
	
	Account wr = new Account("우리은행", "101-12-1002", "김춘추", 1000);
	wr.deposit(30000);
	wr.withdraw(5000);
	wr.show();
	
	}
}