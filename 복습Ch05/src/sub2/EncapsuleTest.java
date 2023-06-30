package sub2;

public class EncapsuleTest {

	public static void main(String[] args) {
	
		Car sonata = new Car("소나타", "흰색", 10);
		sonata.setName("그랜져");
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car("아반떼", "검은색", 10);
		avante.setColor("남색");
		avante.speedUp(80);
		avante.speedDown(20);
		avante.show();
		
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
