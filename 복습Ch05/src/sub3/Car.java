package sub3;

public class Car {

	private String name;
	private String color;
	private int speed;
	
	public static int count;
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	public static int getCount() { // public 없어도 되지 않나? public class 안에서 작성하니까
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
