package kh.com.oop.shopv3;

import java.util.ArrayList;

//���ʸ��� ��������ν� ArrayList ��� �Ǵ� ������ ���ϴ�.
public class Shop {
	private ArrayList<Product> product = new ArrayList<>();

	public Shop() {
	}

	public Shop(ArrayList<Product> product) {
		super();
		this.product = product;
	}

	public ArrayList<Product> getProduct() {
		return product;
	}

//	public void setProduct(ArrayList<Product> product) {
//		this.product = product;
//	}

	public void addProduct(Product product) {
		this.product.add(product);
	}
	
	public void modify(Product product) {
		for(int i = 0 ; i< this.product.size() ; i++ ) {
			if(this.product.get(i).getId().equals(product.getId())) {
				this.product.set(i, product);
			}
		}		
	}
	
	public void printProduct() {

		for (int i = 0; i < product.size(); i++) {
			System.out.println(product.get(i).getId());
			System.out.println(product.get(i).getName());
			System.out.println(product.get(i).getPrice());
		}

		// forEach -> �ڵ����� �迭�� 0���� ������ �������� , �迭�� �ӽú����� �־ ���
		for (Product p : product) { // �ڷ��� �ӽú��� : �迭
//			if (p != null) {			//Arraylist�� �ȶ��ؼ� null���̳� ������� ������ �����Ƿ� �ּ�ó��.
				System.out.println(
						p.getId() + " : " + p.getName() + " : " + p.getPrice() + " : " + p.getPromotionPrice());
//			}
		}

	}
}
