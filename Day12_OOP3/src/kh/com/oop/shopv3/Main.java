package kh.com.oop.shopv3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 문제점 1. 같은 코드가 계속해서 증가(코드의 중복도) --> 상속으로 해결
		// 문제점 2. 코드의 결합도가 높아진다 --> 다형성으로 해결
		// 문제점 3. 정보 저장소(배열) 초기값 설정, 값의 추가, 수정, 삭제 들이 복잡해진다. -> 컬렉션으로 해결

		Scanner sc = new Scanner(System.in);
		Shop shop1 = new Shop();
		String id = "";
		String name = "";
		int price = 0;

		while (true) {
			System.out.println("** 재고 관리 프로그램 **");
			System.out.println("1. 제품 등록");
			System.out.println("2. 제품 목록 확인");
			System.out.println("3. 제품 수정");
			System.out.println("4. 제품 할인 금액 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print(" >> ");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				
				System.out.println("등록할 제품 입력 >>");
				System.out.println("1.빵");
				System.out.println("2.음료");
				System.out.println("3.아이스크림");
				System.out.print(">> ");
				int menu2 = Integer.parseInt(sc.nextLine());
				System.out.println("id 입력 >>");
				id = sc.nextLine();
				System.out.println("name 입력 >>");
				name = sc.nextLine();
				System.out.println("price 입력 >>");
				price = Integer.parseInt(sc.nextLine());
				
				if (menu2 == 1) {
					shop1.addProduct(new Bread(id, name, price));
				} else if (menu2 == 2) {
					shop1.addProduct(new Beverage(id, name, price));
				} else if (menu2 == 3) {
					shop1.addProduct(new IceCream(id, name, price));
				} else {
					System.out.println("다시입력하세요");
				}

			} else if (menu == 2) {
				shop1.printProduct();
			} else if (menu == 3) {
				
				System.out.println("수정할 제품 입력 >>");
				System.out.println("1.빵");
				System.out.println("2.음료");
				System.out.println("3.아이스크림");
				System.out.print(">> ");
				int menu2 = Integer.parseInt(sc.nextLine());
				System.out.println("수정할 id 입력 >>");
				id = sc.nextLine();
				System.out.println("수정할 name 입력 >>");
				name = sc.nextLine();
				System.out.println("수정할 price 입력 >>");
				price = Integer.parseInt(sc.nextLine());
				
				if (menu2 == 1) {
					shop1.modify(new Bread(id, name, price));
				} else if (menu2 == 2) {
					shop1.modify(new Beverage(id, name, price));
				} else if (menu2 == 3) {
					shop1.modify(new IceCream(id, name, price));
				} else {
					System.out.println("다시입력하세요");
				}

			} else if (menu == 4) {
//				shop1.product.getPromotionPrice();
//				iceCream.getPromotionPrice();
//				bv.getPromotionPrice();
			} else if (menu == 0) {
				System.exit(0);
			}

		}
	}
}
