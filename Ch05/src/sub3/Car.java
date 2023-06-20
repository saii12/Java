package sub3;

public class Car {

	private String name;
	private String color;
	private int speed; // Heap에
	
	//클래스변수(정적변수)
	public static int count; //직접 참조하므로 객체 없기 때문에 private X public. Method area에
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++; 
	}
	
	//클래스 메서드(정적메서드)
	public static int getCount() {
		return count;
	}
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
}
