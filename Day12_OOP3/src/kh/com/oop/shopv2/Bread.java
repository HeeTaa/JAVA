package kh.com.oop.shopv2;

public class Bread extends Product{
	public Bread() {
	}

	public Bread(String id, String name, int price) {
		super(id, name, price);  // ��Ӱ��迡�� ���ڰ��� �޴� �����ڴ� super(���ڰ�); �� ���� �����Ҽ��ִ�.
	}
	
	public double getPromotionPrice(){  
		return this.getPrice() * 0.03;  //overide
	}
}

