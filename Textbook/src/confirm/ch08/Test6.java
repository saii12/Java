package confirm.ch08;

interface Soundable {
	public String sound();
}

class Cat implements Soundable {
	@Override
	public String sound() {
		return "야옹"; // 인터페이스 메서드가 아니라 변수를 재정의 해서 이거는 return값이 나오네
	}
}

class Dog implements Soundable {
	@Override
	public String sound() {
		return "멍멍";
	}
}

public class Test6 {

	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound()); 
	}
	
	public static void main(String[] args) {
		printSound(new Cat()); //Soundable 타입의 객체인 new Cat()이 들어온다
		printSound(new Dog());
	}
}
