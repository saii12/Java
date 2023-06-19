package Ch05;

public class ClassTest {

	public static void main(String[] args) {
		
		Car sonata = new Car();

		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car();
		avante.name = "아반떼";
		avante.color = "검은색";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(40);
		avante.show();
		
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id = "101-21-0101";
		kb.name = "김유신";
		kb.balance = 10000;
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
		
		Account wr = new Account();
		wr.bank = "우리은행";
		wr.id = "101-21-0102";
		wr.name = "김춘추";
		wr.balance = 1000;
		
		wr.deposit(30000);
		wr.withdraw(5000);
		wr.show();
		
		
	}
}