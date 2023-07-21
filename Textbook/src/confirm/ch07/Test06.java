package confirm.ch07;

class Parent { //public 없애니까 오류 없어지네
	public String name; 

	public Parent(String name) {
		this.name = name;
	}
}

class Child extends Parent {
	public int studentNo;
	
	public Child(String name, int studentNo) {
		super(name); // 왜 super?? : 부모의 생성자를 호출하는 것
		this.studentNo = studentNo;
		
	}
}

public class Test06 {

}
