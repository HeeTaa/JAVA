package kh.com.opp.homework02_oop;

import java.util.Scanner;

public class Turtlegame {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int money = 0;

		while (true) {
			int ranNum = (int)(Math.random() * (3 - 1 + 1)) + 1;
			String rs = null;

			if (ranNum == 1) {
				rs = "'���� ���� �� ���� ����⸸ �� �ź���'�� �¸��Ͽ����ϴ�..";
			} else if (ranNum == 2) {
				rs = "'�˷ϴ޷� ȭ���� ���� �� ������ �ź���'�� �¸��Ͽ����ϴ�..";
			} else if (ranNum == 3) {
				rs = "'���� ���ſ ��ġ�� Ŀ�� �� ��¦ �ռ��� �ź���'�� �¸��Ͽ����ϴ�..";
			}
			
			System.out.println();
			System.out.println("**** �ź��� ���� ���� ****");
			System.out.println("1. ���ӽ���");
			System.out.println("2. �ܾ���ȸ");
			System.out.println("3. �ܾ�����");
			System.out.println("0. ����");
			System.out.print("�޴��Է� >> ");
			int inMenu = Integer.parseInt(sc.nextLine());
			if (inMenu == 1) {
				System.out.println("�ź��̵��� �غ�Ǿ����ϴ�. �����ϰ��� �ϴ� �ź��̸� �������ּ���.");
				System.out.println("1.���� ���� �� ���� ����⸸ �� �ź���");
				System.out.println("2.�˷ϴ޷� ȭ���� ���� �� ������ �ź���");
				System.out.println("3.���� ���ſ ��ġ�� Ŀ�� �� ��¦ �ռ��� �ź���");
				System.out.println("0.�޴��� ���ư���");
				System.out.print("�Է�  >> ");
				int inMenu2 = Integer.parseInt(sc.nextLine());
				System.out.println("�󸶸� �����Ͻðڽ��ϱ�?");
				System.out.print("�Է�  >> ");
				int bet = Integer.parseInt(sc.nextLine());

				if (bet > money) {
					System.out.println("���� �ݾ��� �ܾ׺��� �����ϴ�. �ݾ��� �������ּ���.");
				} else if (inMenu2 == 1) {
					money -= bet;
					System.out.println("1.���� ���� �� ���� ����⸸ �� �ź��̿�" + bet + "�� �� �����Ͽ����ϴ�.");
					if (inMenu2 == ranNum) {
						System.out.println(rs);
						System.out.println("������" + bet + "���� 3�踦 �����ϴ�");
						money += bet * 3;
					} else if (inMenu2 != ranNum) {
						System.out.println("��������, " + bet + "���� �Ҿ����ϴ�..");
						System.out.println(rs);
						System.out.println("���� ���� " + money + "�� �Դϴ�..");
					}
				} else if (inMenu2 == 2) {
					money -= bet;
					System.out.println("2.�˷ϴ޷� ȭ���� ���� �� ������ �ź��̿�" + bet + "�� �� �����Ͽ����ϴ�.");
					if (inMenu2 == ranNum) {
						System.out.println(rs);
						System.out.println("������" + bet + "���� 3�踦 �����ϴ�");
						money += bet * 3;
					} else if (inMenu2 != ranNum) {
						System.out.println("��������, " + bet + "���� �Ҿ����ϴ�..");
						System.out.println(rs);
						System.out.println("���� ���� " + money + "�� �Դϴ�..");
					}
				} else if (inMenu2 == 3) {
					money -= bet;
					System.out.println("3.���� ���ſ ��ġ�� Ŀ�� �� ��¦ �ռ��� �ź��̿� " + bet + "�� �� �����Ͽ����ϴ�.");
					if (inMenu2 == ranNum) {
						System.out.println(rs);
						System.out.println("������" + bet + "���� 3�踦 �����ϴ�");
						money += bet * 3;
					} else if (inMenu2 != ranNum) {
						System.out.println("��������, " + bet + "���� �Ҿ����ϴ�..");
						System.out.println(rs);
						System.out.println("���� ���� " + money + "�� �Դϴ�..");
					}
				} else if (inMenu2 == 0) {
					break;
				} else {
					System.out.println("�ٽ� �Է����ּ���.");
				}
			} else if (inMenu == 2) {
				System.out.println("���� �ܾ��� " + money + "�� �Դϴ�.");
				
			} else if (inMenu == 3) {
				System.out.println("������ �ݾ��� �Է��ϼ���.");
				System.out.println(">> ");
				money += Integer.parseInt(sc.nextLine());
				System.out.println("���� �ܾ��� " + money + "�� �Դϴ�.");
				

			} else if (inMenu == 0) {
				System.out.println("**** GoodBye ****");
				break;
			} else {
				System.out.println("�ٽ� �Է����ּ���.");
				
			}

		}
	}
}
