
package kh.com.oop.shop;

public class Shop {
	private Product[] product = new Product[10]; // ������������� ���ÿ� �ν��Ͻ�ȭ
	private int index = 0;

	public Shop() {
	}

	public Shop(Product[] product) {
		super();
		this.product = product;
	}

	public Product[] getProduct() {
		return product;
	}

	public void setProduct(Product[] product) {
		this.product = product;
	}

	public void addProduct(Product product) {
		this.product[index++] = product;
	}

	public void printProduct() {

		for (int i = 0; i < product.length; i++) {
			if (this.product[i] != null) {
				System.out.println(product[i].getId() + " : " + product[i].getName() + " : " + product[i].getPrice());
			}
		}

		// forEach -> �ڵ����� �迭�� 0���� ������ �������� , �迭�� �ӽú����� �־ ���
		for (Product p : product) { // �ڷ��� �ӽú��� : �迭
			if (p != null) {
				System.out.println(p.getId() + " : " + p.getName() + " : " + p.getPrice());
			}
		}

	}
}
