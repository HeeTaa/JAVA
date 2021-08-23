package kh.com.oop.shop;

class A {
	public void funcA() {
		System.out.println("A");
	}

	public void funcH() {
		System.out.println("A�Դϴ�.");
	}
}

class B extends A { 
	public void funcB() {
		System.out.println("B");
	}

	public void funcH() {
		System.out.println("B�Դϴ�."); // overide
	}
}

class C extends B {
	public void funcC() {
		System.out.println("C");
	}
}

public class Temp {
	public static void main(String[] args) {
		// ������ : �پ��� ������ ������ ���� ��
		// ��Ŭ������ �پ��� Ŭ������ �ν��Ͻ��� ���� �� �ִ�(�پ��� Ŭ������ ������ ������ �ִ�)��
		// �θ�Ŭ���� Ÿ���� ���������� �ڽ��� �ν��Ͻ��� ���� �� �ִ� ��
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		a2.funcA();  // �θ��� A�� ������ ���δ�
		a2.funcH();  // �ڽ� B�� �������̵� �� �޼��常 ���δ�.
		
		((B)a2).funcB(); //A���� a2�� B������ ���� ����ȯ �ϸ� A,B��� ������ �����ִ�.
		
		

	}
}
