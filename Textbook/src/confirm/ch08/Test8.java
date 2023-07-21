package confirm.ch08;

interface _A {
	public void method1();
}

class _B implements _A {
	@Override
	public void method1() {
		System.out.println("_B - method1()");		
	}
}

class _C implements _A {
	@Override
	public void method1() {
		System.out.println("_C - method1()");		
	}
	
	public void method2() {
		System.out.println("_C - method2()");		
	}
}


public class Test8 {
	
	public static void action(_A a) {
		a.method1();
		
		if(a instanceof _C c) {
			c.method2();
		}
		
	}
	
	public static void main(String[] args) {
		// 8번
		action(new _B());
		action(new _C());
		
	}
}