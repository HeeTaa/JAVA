package kh.com.oop.constructor;


public class Laptop {
	
	//멤버필드
	private String brand;
	private int price;
	
	
	public Laptop() {};//기본 생성자 : 매개변수X
					   //따로 명시해주지 않아도 프로그램이 자동으로 생성해주지만
					   //항상 직접 만들어주도록한다 ( 다른프로그램에서 연동하려면 필요)
	public Laptop(String brand, int price) { //오버로딩 생성자 , 우클릭 source에서 자동생성가능
		super();
		this.brand = brand;
		this.price = price;
	}
	
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//멤버메서드
	public void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	public void powerOff() {
		System.out.println("전원이 꺼졌습니다.");
	}
	public void wifiOn(String name) {
		System.out.println(name + "에 연결합니다.");
	}
	public void wifiOff() {
		System.out.println("wifi 연결을 종료합니다.");
	}
	
}
