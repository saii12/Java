package Ch05;

public class Car3 {

	private String name;
	private String color;
	private int speed;
	public static int count;
	
	public Car3(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	public static int getCount() { // 다른 메서드랑 다르게 void 아니고 int임 why?
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
