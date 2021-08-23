package kh.com.oop.shopv2;
import java.util.ArrayList;

//Product�� �迭 Ŭ������ ArrayList�� Ŭ������ �ٲ㺸��.
public class Shop {
	private ArrayList product = new ArrayList(); 

	public Shop() {
	}

	
	public Shop(ArrayList product) {
		super();
		this.product = product;
	}


	public ArrayList getProduct() {
		return product;
	}


	public void setProduct(ArrayList product) {
		this.product = product;
	}


	public void addProduct(Product product) {	  //Main���� Product�� product �ν��Ͻ��� �޾ƿͼ� ��ü�� product�� �־������� product�� �θ��� ��ü�� ��ɵ鸸 ����Ҽ��ִ�.
		this.product.add(product);
	}

	public void printProduct() {

		for (int i = 0; i < product.size(); i++) {
			System.out.println(((Product)product.get(i)).getId());       // �ڽ��� Product���� ��ɵ��� ����Ϸ��� Product������ ��������ȯ. ��, �ٿ�ĳ������ �ؾ��Ѵ�.
			System.out.println(((Product)product.get(i)).getName());
			System.out.println(((Product)product.get(i)).getPrice());
		}

		// forEach -> �ڵ����� �迭�� 0���� ������ �������� , �迭�� �ӽú����� �־ ���
//		for (Product p : product) { // �ڷ��� �ӽú��� : �迭
//			if (p != null) {
//				System.out.println(p.getId() + " : " + p.getName() + " : " + p.getPrice());
//			}
//		}

	}
}
