package kh.com.fileio.object;

public class IceCream {
	private String name;
	private int price;
	private String expiry_date;

	public IceCream() {
	}

	public IceCream(String name, int price, String expiry_date) {
		super();
		this.name = name;
		this.price = price;
		this.expiry_date = expiry_date;
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

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	public String toString() {
		return name + ", " + price + ", " + expiry_date ;
	}
}
