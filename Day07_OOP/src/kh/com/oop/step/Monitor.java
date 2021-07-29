package kh.com.oop.step;

		//1. 대상을 선정
		//2. 추상적 설계(속성 / 기능)
		//   ex) 모니터 : 속성 - 색, 사이즈, 브랜드, 가격
		//     모니터 : 기능 - 화면 ON/OFF , 소리 UP/DOWN
		//3. 클래스에서 객체를 설계한다.

public class Monitor {
	String color;
	int size;
	String brand;
	int price;

	void powerOn() {
		System.out.println("화면이 켜졌습니다.");
	}
	void powerOff() {
		System.out.println("화면이 꺼졌습니다.");
	}
	void volumeUp(int no) {
		System.out.println(no + "만큼 소리가 커졌습니다.");
	}
	void volumeDown(int no) {
		System.out.println(no + "만큼 소리가 작아졌습니다.");
	}
}
