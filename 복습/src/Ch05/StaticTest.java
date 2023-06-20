package Ch05;

class Increment {
	private	int num1;
	public static int num2; // num2는 static으로 method area에 있어서 누적되는 것
	
	public Increment() { // 생성자는 public 하고 바로.
		num1++;
		num2++;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
}

public class StaticTest {

	public static void main(String[] args) {
		
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		Car3 sonata = new Car3("소나타", "흰색", 10);
		Car3 avante = new Car3("아반떼", "검정", 20);
		Car3 grande = new Car3("그랜져", "남색", 30); // 객체 새로 만들때마다 count 1씩 누적
		
		sonata.show();
		avante.show();
		grande.show();
		
		System.out.println("전체 차량수 : " + Car3.count);
		System.out.println("현재 차량수 : " + Car3.getCount());
	}	
}
