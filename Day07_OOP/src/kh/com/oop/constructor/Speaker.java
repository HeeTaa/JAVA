package kh.com.oop.constructor;

//속성:브랜드,가격,크기,볼륨  기능:볼륨조절
public class Speaker {
	// 멤버변수
	private String brand;
	private String size;
	private int price;

	public Speaker() {};  //기본생성자
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	};
	
	// 기능
	public void volume(int volume) {
		System.out.println("볼륨 :" + volume);
	}

}
