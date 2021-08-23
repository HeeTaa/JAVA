package kh.com.oop.shopv2;

//추상메서드를 하나 이상 가진 클래스는 무조건 추상 클래스로 해야한다
//추상 클래스가 되면 Product형 인스턴스를 new할수없다
public abstract class Product {
	private String id; // 제품번호
	private String name; // 제품명
	int price; // 제품가격

	public Product() {
	}

	public Product(String id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	// abstract가 붙은 메서드 -> 추상메서드
	public abstract double getPromotionPrice();
		
}
