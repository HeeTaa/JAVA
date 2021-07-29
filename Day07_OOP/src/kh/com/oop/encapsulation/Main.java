package kh.com.oop.encapsulation;

public class Main {
	public static void main(String[] args) {

		Car avante = new Car();
		Car morning = new Car();

		avante.setBrand("Hyundai");
		avante.price = 50;
		avante.speed = 0;

		morning.brand = "Kia";
		morning.price = 50;
		morning.speed = 0;

	}
}
