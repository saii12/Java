package Ch05;

public class EncapsuleTest {

	public static void main(String[] args) {
		
	Car2 sonata = new Car2("소나타", "흰색", 10);
	sonata.speedUp(80);
	sonata.speedDown(20);
	sonata.show();
	
	Car2 avante = new Car2("아반떼", "검은색", 10);
	avante.speedUp(60);
	avante.speedDown(20);
	avante.show();
	}
}
