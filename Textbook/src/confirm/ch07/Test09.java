package confirm.ch07;

class A {
	
}

class B extends A {
	
}

class C extends A {
	
}

class D extends B {
	
}

class E extends B {
	
}

class F extends C {
	
}

public class Test09 {
	
	public static void main(String[] args) {
		// 9번
		B b1 = new B();
		B b2 = new D();
		B b3 = new E();
		B b4 = (B) new A();
		
	}
	
	
	
}
