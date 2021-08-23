package kh.com.oop.shopv3;

import java.util.ArrayList;

//제너릭을 사용함으로써 ArrayList 사용 또는 관리가 편하다.
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

		// forEach -> 자동으로 배열의 0부터 끝까지 증가연산 , 배열을 임시변수에 넣어서 사용
		for (Product p : product) { // 자료형 임시변수 : 배열
//			if (p != null) {			//Arraylist는 똑똑해서 null값이나 빈공간을 만들지 않으므로 주석처리.
				System.out.println(
						p.getId() + " : " + p.getName() + " : " + p.getPrice() + " : " + p.getPromotionPrice());
//			}
		}

	}
}
