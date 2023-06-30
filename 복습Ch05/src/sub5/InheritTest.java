package sub5;

class Parent {
	private int num1;
	private int num2;
	
	public Parent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int plus() { // plus()라는 메서드는 int값이 나오니까 void X int
		return num1 + num2;
	}
}

class Child extends Parent {
	private int num3;
	private int num4;
	
	public Child(int num1, int num2, int num3, int num4) {
		super(num1, num2);
		this.num3 = num3;
		this.num4 = num4;
	}
	
	public int minus() {
		return num3 - num4;
	}
	
}

public class InheritTest {

	
}
