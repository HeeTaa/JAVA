package kh.com.oop.constructor;


public class Laptop {
	
	//����ʵ�
	private String brand;
	private int price;
	
	
	public Laptop() {};//�⺻ ������ : �Ű�����X
					   //���� ��������� �ʾƵ� ���α׷��� �ڵ����� ������������
					   //�׻� ���� ������ֵ����Ѵ� ( �ٸ����α׷����� �����Ϸ��� �ʿ�)
	public Laptop(String brand, int price) { //�����ε� ������ , ��Ŭ�� source���� �ڵ���������
		super();
		this.brand = brand;
		this.price = price;
	}
	
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//����޼���
	public void powerOn() {
		System.out.println("������ �������ϴ�.");
	}
	public void powerOff() {
		System.out.println("������ �������ϴ�.");
	}
	public void wifiOn(String name) {
		System.out.println(name + "�� �����մϴ�.");
	}
	public void wifiOff() {
		System.out.println("wifi ������ �����մϴ�.");
	}
	
}
