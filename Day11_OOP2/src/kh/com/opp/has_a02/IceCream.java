package kh.com.opp.has_a02;

public class IceCream {
	private String id; // 力前锅龋
	private String name; // 力前疙
	int price; // 力前啊拜

	public IceCream() {
	}

	public IceCream(String id, String name, int price) {
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
	};

}
