package kh.com.oop.step;

		//1. ����� ����
		//2. �߻��� ����(�Ӽ� / ���)
		//   ex) ����� : �Ӽ� - ��, ������, �귣��, ����
		//     ����� : ��� - ȭ�� ON/OFF , �Ҹ� UP/DOWN
		//3. Ŭ�������� ��ü�� �����Ѵ�.

public class Monitor {
	String color;
	int size;
	String brand;
	int price;

	void powerOn() {
		System.out.println("ȭ���� �������ϴ�.");
	}
	void powerOff() {
		System.out.println("ȭ���� �������ϴ�.");
	}
	void volumeUp(int no) {
		System.out.println(no + "��ŭ �Ҹ��� Ŀ�����ϴ�.");
	}
	void volumeDown(int no) {
		System.out.println(no + "��ŭ �Ҹ��� �۾������ϴ�.");
	}
}
