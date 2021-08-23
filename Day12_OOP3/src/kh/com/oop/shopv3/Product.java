package kh.com.oop.shopv3;

public abstract class Product {
	private String id; // ��ǰ��ȣ
	private String name; // ��ǰ��
	int price; // ��ǰ����

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

	public abstract double getPromotionPrice();
		
}
