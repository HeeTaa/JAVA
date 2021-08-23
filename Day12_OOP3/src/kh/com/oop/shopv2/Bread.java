package kh.com.oop.shopv2;

public class Bread extends Product{
	public Bread() {
	}

	public Bread(String id, String name, int price) {
		super(id, name, price);  // 상속관계에서 인자값을 받는 생성자는 super(인자값); 을 통해 생성할수있다.
	}
	
	public double getPromotionPrice(){  
		return this.getPrice() * 0.03;  //overide
	}
}

