package sub2;

public class Car {

	// 필드(속성)
	private String name; // 속성은 기본적으로 캡슐화
	private String color;
	private int speed;
	
	// 생성자 : 캡슐화된 속성을 초기화하기 위한 메서드
	public Car(String name, String color, int speed) {
		this.name = name; // => 변수name에 name을 대입하라
		this.color = color;
		this.speed = speed;
		
	}
	
	// 메서드(기능)
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
	
	// Getter, Setter 정의 - 필요에 따라서 정의
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
