package kh.com.oop.has_a01;

public class Worker {
	// ������ȣ, �̸�, �޴�����ȣ
	private String id;
	private String name;
	private String phone;

	public Worker() {
	}

	public Worker(String id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
