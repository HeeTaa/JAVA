package kh.com.oop.shopv3;

public class IceCream extends Product { // 자식클래스 IceCream , 부모클래스 Product
	public IceCream() {
	}

	public IceCream(String id, String name, int price) {
		super(id, name, price); // 상속관계에서 인자값을 받는 생성자는 super(인자값); 을 통해 생성할수있다.
	}

	public double getPromotionPrice() {
		return this.getPromotionPrice() * 0.02; // 부모클래스의 추상클래스를 꼭 구현해야한다.
	}

}
