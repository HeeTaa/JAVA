package kh.com.oop.shopv2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ������ 1. ���� �ڵ尡 ����ؼ� ����(�ڵ��� �ߺ���) --> ������� �ذ�
		// ������ 2. �ڵ��� ���յ��� �������� --> ���������� �ذ�
		// ������ 3. ���� �����(�迭) �ʱⰪ ����, ���� �߰�, ����, ���� ���� ����������. -> �÷������� �ذ�

		Scanner sc = new Scanner(System.in);
		Shop shop1 = new Shop();

		while (true) {
			System.out.println("** ��� ���� ���α׷� **");
			System.out.println("1. ��ǰ ���");
			System.out.println("2. ��ǰ ��� Ȯ��");
			System.out.println("3. ��ǰ ���� �ݾ� ���");
			System.out.println("0. ���α׷� ����");
			System.out.print(" >> ");
			int menu = Integer.parseInt(sc.nextLine());

			Product bread = new Bread("001", "�ó����", 1000);
			Product iceCream = new IceCream("002", "���Ʈ", 1000);
			Product bv = new Beverage("003", "�Ƹ޸�ī��", 1000);

			if (menu == 1) {
//				System.out.println("id �Է� >>");
//				String id = sc.nextLine();
//				System.out.println("name �Է� >>");
//				String name = sc.nextLine();
//				System.out.println("price �Է� >>");
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
