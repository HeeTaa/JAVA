package kh.com.oop.shopv3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ������ 1. ���� �ڵ尡 ����ؼ� ����(�ڵ��� �ߺ���) --> ������� �ذ�
		// ������ 2. �ڵ��� ���յ��� �������� --> ���������� �ذ�
		// ������ 3. ���� �����(�迭) �ʱⰪ ����, ���� �߰�, ����, ���� ���� ����������. -> �÷������� �ذ�

		Scanner sc = new Scanner(System.in);
		Shop shop1 = new Shop();
		String id = "";
		String name = "";
		int price = 0;

		while (true) {
			System.out.println("** ��� ���� ���α׷� **");
			System.out.println("1. ��ǰ ���");
			System.out.println("2. ��ǰ ��� Ȯ��");
			System.out.println("3. ��ǰ ����");
			System.out.println("4. ��ǰ ���� �ݾ� ���");
			System.out.println("0. ���α׷� ����");
			System.out.print(" >> ");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				
				System.out.println("����� ��ǰ �Է� >>");
				System.out.println("1.��");
				System.out.println("2.����");
				System.out.println("3.���̽�ũ��");
				System.out.print(">> ");
				int menu2 = Integer.parseInt(sc.nextLine());
				System.out.println("id �Է� >>");
				id = sc.nextLine();
				System.out.println("name �Է� >>");
				name = sc.nextLine();
				System.out.println("price �Է� >>");
				price = Integer.parseInt(sc.nextLine());
				
				if (menu2 == 1) {
					shop1.addProduct(new Bread(id, name, price));
				} else if (menu2 == 2) {
					shop1.addProduct(new Beverage(id, name, price));
				} else if (menu2 == 3) {
					shop1.addProduct(new IceCream(id, name, price));
				} else {
					System.out.println("�ٽ��Է��ϼ���");
				}

			} else if (menu == 2) {
				shop1.printProduct();
			} else if (menu == 3) {
				
				System.out.println("������ ��ǰ �Է� >>");
				System.out.println("1.��");
				System.out.println("2.����");
				System.out.println("3.���̽�ũ��");
				System.out.print(">> ");
				int menu2 = Integer.parseInt(sc.nextLine());
				System.out.println("������ id �Է� >>");
				id = sc.nextLine();
				System.out.println("������ name �Է� >>");
				name = sc.nextLine();
				System.out.println("������ price �Է� >>");
				price = Integer.parseInt(sc.nextLine());
				
				if (menu2 == 1) {
					shop1.modify(new Bread(id, name, price));
				} else if (menu2 == 2) {
					shop1.modify(new Beverage(id, name, price));
				} else if (menu2 == 3) {
					shop1.modify(new IceCream(id, name, price));
				} else {
					System.out.println("�ٽ��Է��ϼ���");
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
