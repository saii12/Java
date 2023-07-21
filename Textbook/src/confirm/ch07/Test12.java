package confirm.ch07;

import java.awt.Desktop.Action;

class A {
	public void method1() {
		System.out.println("A-method1()");
	}
}

class B extends A {
	public void method1() {
		System.out.println("B-method1()");
	}
}

class C extends A {
	public void method1() {
		System.out.println("C-method1()");
	}
	public void method2() {
		System.out.println("C-method2()");
	}
}

public class Test12 {

	public static void action(A a) {
		a.method1();
		if(a instanceof C c) { //instanceof은 타입확인, 자식은 부모의 타입을 따라가지만 부모는 자식의 타입을 따라가지 않는다.
			c.method2();
		}
	}
	
	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
	}
}
