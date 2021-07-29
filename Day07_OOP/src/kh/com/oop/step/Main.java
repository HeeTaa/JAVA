package kh.com.oop.step;

public class Main {
	public static void main(String[] args) {
				
		Monitor monitor = new Monitor();
		Monitor monitor2 = new Monitor();
		Mouse mouse = new Mouse();
		
		     //  .참조연산자
		monitor.color = "Black";
		monitor.size = 24;
		monitor.brand = "Samsung";
		monitor.price = 200000;
		
		monitor2.color = "White";
		monitor2.size = 32;
		monitor2.brand = "LG";
		monitor2.price = 400000;
		
		mouse.color =  "Red";
		mouse.price = 30000;
			
		System.out.println(monitor.color);
		System.out.println(monitor.size);
		System.out.println(monitor.brand);
		System.out.println(monitor.price);
		
		monitor.powerOn();  
		mouse.speedOn();
		mouse.speedOff();
		
		
		
	}
}
