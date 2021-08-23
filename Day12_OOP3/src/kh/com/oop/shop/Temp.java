package kh.com.oop.shop;

class A {
	public void funcA() {
		System.out.println("A");
	}

	public void funcH() {
		System.out.println("A입니다.");
	}
}

class B extends A { 
	public void funcB() {
		System.out.println("B");
	}

	public void funcH() {
		System.out.println("B입니다."); // overide
	}
}

class C extends B {
	public void funcC() {
		System.out.println("C");
	}
}

public class Temp {
	public static void main(String[] args) {
		// 다형성 : 다양한 형태의 성질을 갖는 것
		// 한클래스가 다양한 클래스의 인스턴스를 담을 수 있는(다양한 클래스의 성질을 가질수 있는)것
		// 부모클래스 타입의 참조변수가 자식형 인스턴스를 담을 수 있는 것
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		a2.funcA();  // 부모인 A의 영역만 보인다
		a2.funcH();  // 자식 B의 오버라이딩 된 메서드만 보인다.
		
		((B)a2).funcB(); //A형인 a2를 B형으로 강제 형변환 하면 A,B모든 영역을 볼수있다.
		
		

	}
}
