package kh.com.opp.homework_oop;

public class Person {
	//멤버필드
	private int id;
	private String name;
	private String contact;

	Person() {
	}; // 기본생성자

	public Person(int id, String name, String contact) { // 생성자
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	// getter, setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void printAll() {
		System.out.println("id : " + id + "이름 : " + name + "연락처 : " + contact);
	}

}
