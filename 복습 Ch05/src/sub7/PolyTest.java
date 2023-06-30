package sub7;

public class PolyTest {

	public static void main(String[] args) {
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a1.hunt();
		
		a2.move();
		a2.hunt();
		
		a3.move();
		a3.hunt();
		
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
		
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger입니다.");
		}else if(a1 instanceof Eagle) {
			System.out.println("a1은 Eagle입니다.");
		}else if(a1 instanceof Shark) {
			System.out.println("a1은 Shark입니다.");
		}
		
		
	}
}
