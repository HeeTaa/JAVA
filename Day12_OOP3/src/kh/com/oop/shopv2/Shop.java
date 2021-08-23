package kh.com.oop.shopv2;
import java.util.ArrayList;

//Product형 배열 클래스를 ArrayList형 클래스로 바꿔보기.
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


	public void addProduct(Product product) {	  //Main에서 Product형 product 인스턴스를 받아와서 객체형 product에 넣어줬으니 product는 부모의 객체형 기능들만 사용할수있다.
		this.product.add(product);
	}

	public void printProduct() {

		for (int i = 0; i < product.size(); i++) {
			System.out.println(((Product)product.get(i)).getId());       // 자식인 Product형의 기능들을 사용하려면 Product형으로 강제형변환. 즉, 다운캐스팅을 해야한다.
			System.out.println(((Product)product.get(i)).getName());
			System.out.println(((Product)product.get(i)).getPrice());
		}

		// forEach -> 자동으로 배열의 0부터 끝까지 증가연산 , 배열을 임시변수에 넣어서 사용
//		for (Product p : product) { // 자료형 임시변수 : 배열
//			if (p != null) {
//				System.out.println(p.getId() + " : " + p.getName() + " : " + p.getPrice());
//			}
//		}

	}
}
