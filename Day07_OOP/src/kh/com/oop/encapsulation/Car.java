package kh.com.oop.encapsulation;

// 캡슐화(encapsulation) -> 정보은닉

//   접근제한자
//   public : 모든 클래스에서 접근이 가능한
//   private : 해당 클래스에서만 접근이 가능하지만 getter,setter를 이용해 접근을 허용해준다.
//   package(default) : 같은 패키지 내에서만 접근 가능한
//   protected : 같은 패키지내의 클래스나 해당 클래스를 상속 받았을때 접근 가능한

public class Car {
	// 속성 : 멤버필드(멤버변수)
	// 일반적으로 자바에서 객체의 설계도(클래스)를 작성할때 멤버변수를 private 접근제한자로 설정하기로 약속했다.
	private String brand;
	private int speed;
	private int price;
	
	//getter / setter // 우클릭 -> source -> getter setter 으로 자동으로 생성가능
	public void setBrand(String brand) {	//매개변수명은 멤버변수명과 똑같이해주는것이 좋다.		   
		if(brand.equals("Kia")) {    //조건을 넣어줘서 다른 데이터값을 제한한다.
		this.brand = brand; //this : 자기자신을 참조하는   //자기자신 brand변수에 매개변수를 넣어준다 
		}
	}
	public String getBrand() {
		return this.brand;
	}	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	void speedUp() {
		speed += 1;	
		System.out.println(speed);
	}
	void speedDown() {
		speed -= 1;	
		System.out.println(speed);
	}
	void powerOn() {
		System.out.println("시동 on");
	}
	void powerOff() {
		System.out.println("시동 off");
	}
}
