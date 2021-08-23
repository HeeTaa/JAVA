package kh.com.oop.shopv3;

public class IceCream extends Product { // �ڽ�Ŭ���� IceCream , �θ�Ŭ���� Product
	public IceCream() {
	}

	public IceCream(String id, String name, int price) {
		super(id, name, price); // ��Ӱ��迡�� ���ڰ��� �޴� �����ڴ� super(���ڰ�); �� ���� �����Ҽ��ִ�.
	}

	public double getPromotionPrice() {
		return this.getPromotionPrice() * 0.02; // �θ�Ŭ������ �߻�Ŭ������ �� �����ؾ��Ѵ�.
	}

}
