package sub3;


class Increment{
	private int num1;
	public static int num2;
	
	public Increment() {
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
		
		Car sonata = new Car("소나타", "흰색", 10);
		Car avante = new Car("아반떼", "검정", 20);
		Car grande = new Car("그랜져", "남색", 30);
		
		sonata.show();
		avante.show();
		grande.show();
		
		System.out.println("전체 차량수 : " + Car.count); // 정적필드 클래스.과 같은 이런 형식은 정적멤버만 가능(Car.show X)
		System.out.println("현재 차량수 : " + Car.getCount()); // 정적메서드
		
		Calc c1 = Calc.getInstance(); // c1, c2 모두 calc 클래스의 instance 객체를 가리킴
		Calc c2 = Calc.getInstance();
		
		int result1 = c1.plus(1, 2);
		int result2 = c2.minus(1, 2);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		
	}
}
