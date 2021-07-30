package kh.com.oop.constructor;

public class Main {
	public static void main(String[] args) {

		Laptop laptop = new Laptop();
		Speaker speaker = new Speaker();
		
		laptop.setBrand("LG");
		laptop.setPrice(500000);
		laptop.powerOn();
		laptop.wifiOn("KT-5G");
		speaker.setBrand("Samsung");
		speaker.setPrice(100000);
		speaker.setSize("Small");
		
		System.out.println("브랜드 :" + speaker.getBrand());
		System.out.println("가격 :" + speaker.getPrice());
		System.out.println("크기 :" + speaker.getSize());
		
		speaker.volume(50);
		speaker.volume(20);
	
	}
}
