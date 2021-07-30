package kh.com.oop.encapsulation;

public class Main {
	public static void main(String[] args) {

		Car avante = new Car();
		Car morning = new Car();

		avante.setBrand("Hyundai");
		avante.setPrice(5000000);
		avante.setSpeed(0); 

		morning.setBrand("Kia");
		morning.setPrice(5000000);
		morning.setSpeed(0);

	}
}
