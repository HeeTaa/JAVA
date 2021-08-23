
package kh.com.oop.shop;

public class Shop {
	private Product[] product = new Product[10]; // 참조변수선언과 동시에 인스턴스화
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

		// forEach -> 자동으로 배열의 0부터 끝까지 증가연산 , 배열을 임시변수에 넣어서 사용
		for (Product p : product) { // 자료형 임시변수 : 배열
			if (p != null) {
				System.out.println(p.getId() + " : " + p.getName() + " : " + p.getPrice());
			}
		}

	}
}
