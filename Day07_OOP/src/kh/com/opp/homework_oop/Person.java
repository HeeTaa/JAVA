package kh.com.opp.homework_oop;

public class Person {
	//����ʵ�
	private int id;
	private String name;
	private String contact;

	Person() {
	}; // �⺻������

	public Person(int id, String name, String contact) { // ������
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
		System.out.println("id : " + id + "�̸� : " + name + "����ó : " + contact);
	}

}
