package kh.com.oop.constructor;

//�Ӽ�:�귣��,����,ũ��,����  ���:��������
public class Speaker {
	// �������
	private String brand;
	private String size;
	private int price;

	public Speaker() {};  //�⺻������
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	};
	
	// ���
	public void volume(int volume) {
		System.out.println("���� :" + volume);
	}

}
