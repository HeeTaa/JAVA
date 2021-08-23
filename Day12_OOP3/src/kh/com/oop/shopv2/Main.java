package kh.com.oop.shopv2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 문제점 1. 같은 코드가 계속해서 증가(코드의 중복도) --> 상속으로 해결
		// 문제점 2. 코드의 결합도가 높아진다 --> 다형성으로 해결
		// 문제점 3. 정보 저장소(배열) 초기값 설정, 값의 추가, 수정, 삭제 들이 복잡해진다. -> 컬렉션으로 해결

		Scanner sc = new Scanner(System.in);
		Shop shop1 = new Shop();

		while (true) {
			System.out.println("** 재고 관리 프로그램 **");
			System.out.println("1. 제품 등록");
			System.out.println("2. 제품 목록 확인");
			System.out.println("3. 제품 할인 금액 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print(" >> ");
			int menu = Integer.parseInt(sc.nextLine());

			Product bread = new Bread("001", "시나몬롤", 1000);
			Product iceCream = new IceCream("002", "요거트", 1000);
			Product bv = new Beverage("003", "아메리카노", 1000);

			if (menu == 1) {
//				System.out.println("id 입력 >>");
//				String id = sc.nextLine();
//				System.out.println("name 입력 >>");
//				String name = sc.nextLine();
//				System.out.println("price 입력 >>");
//				int price = Integer.parseInt(sc.nextLine());
				shop1.addProduct(bread);
				shop1.addProduct(iceCream);
				shop1.addProduct(bv);
			} else if (menu == 2) {
				shop1.printProduct();
			} else if (menu == 3) {
				bread.getPromotionPrice();
				iceCream.getPromotionPrice();
				bv.getPromotionPrice();
			} else if (menu == 0) {
				System.exit(0);
			}

		}
	}
}
