package kh.com.oop.shopv3;

public class Beverage extends Product{
	public Beverage() {
	}

	public Beverage(String id, String name, int price) {
		super(id, name, price);  // ��Ӱ��迡�� ���ڰ��� �޴� �����ڴ� super(���ڰ�); �� ���� �����Ҽ��ִ�.
	}
	
	public double getPromotionPrice(){
		return this.getPrice() * 0.04;
	}
}
