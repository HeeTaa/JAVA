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
					System.out.println("1.���� ���� �� ���� ����⸸ �� �ź��̿�" + bet + "�� �� �����Ͽ����ϴ�.");
					money -= bet;
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
					System.out.println("2.�˷ϴ޷� ȭ���� ���� �� ������ �ź��̿�" + bet + "�� �� �����Ͽ����ϴ�.");
					money -= bet;
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
					System.out.println("3.���� ���ſ ��ġ�� Ŀ�� �� ��¦ �ռ��� �ź��̿� " + bet + "�� �� �����Ͽ����ϴ�.");
					money -= bet;
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

///////////////������ �ڵ�
//package kh.com.practice.turtlebet;
//
//import java.util.Scanner;
//
//public class TurtleBet {
//   public static void main(String[] args) {
//
//      Scanner sc = new Scanner(System.in);
//      int total = 0; // �ܾ� ���� �ʱ�ȭ �۾�
//      String[] turtles = new String[] { "���� ���� �ź���", "�˷ϴ޷� �ź���", "��ġ ū �ź���" }; // �ź��� �迭 ����
//
//      while (true) { // ����� ���� ������ ��� �޴� ����
//         System.out.println("\n*** �ź��� ���� ���� ****");
//         System.out.println("1. ���ӽ���");
//         System.out.println("2. �ܾ���ȸ");
//         System.out.println("3. �ܾ�����");
//         System.out.println("0. ����");
//
//         System.out.print("\n�޴��Է� >> ");
//         int menu = Integer.parseInt(sc.nextLine());
//
//         switch (menu) {
//         case 1: // ���ӽ���
//            int ranTurtle = (int) (Math.random() * 3); // 0~2 ����(�ε���)���� ���� 1�� �ź��� �̱�
//
//            System.out.println("\n�ź��̵��� �غ�Ǿ����ϴ�. �����ϰ��� �ϴ� �ź��̸� �������ּ���.");
//            System.out.println("1. " + turtles[0]);
//            System.out.println("2. " + turtles[1]);
//            System.out.println("3. " + turtles[2]);
//            System.out.println("0. �޴��� ���ư���");
//            System.out.print("�Է� >> ");
//            int betting = Integer.parseInt(sc.nextLine());
//
//            if (betting == 0) { // �޴��� �ٽõ��ư���
//               continue;
//            }
//
//            System.out.println("\n�󸶸� �����Ͻðڽ��ϱ�?");
//            System.out.print("�Է� >> ");
//            int bet = Integer.parseInt(sc.nextLine()); // ���ñݾ� ������ �ֱ�
//
//            if (bet == 0 || bet > total) { // ���ñݾ��� 0���̰ų� �ܾ׺��� ���ٸ� �޴��� ���ư���.
//               System.out.println("\n���� �ݾ��� �ܾ׺��� �����ϴ�. ");
//               continue;
//            } else { // ���ñݾ��� �������̶�� � �ź��̿� �󸶸� �����ߴ��� �����ֱ�
//               System.out.println("\n" + turtles[betting - 1] + " �� " + bet + "���� �����Ͽ����ϴ�.");
//            }
//
//            if (betting == 1 && ranTurtle == 0) { // ���� ����� �� �ɷ��ֱ�.
//            } else if (betting == 2 && ranTurtle == 1) {
//            } else if (betting == 3 && ranTurtle == 2) {
//            } else { // ���ÿ� �������� ��
//               System.out.println("\n��������, " + bet + "���� �Ҿ����ϴ�...");
//               System.out.println(turtles[ranTurtle] + "�� �¸��߽��ϴ�...");
//               total -= bet; // ���� �ܾ׿��� ���ñݾ� ����
//               System.out.println("���� ���� " + total + "�Դϴ�.");
//               break;
//            }
//            System.out.println("\n�����մϴ�. " + turtles[ranTurtle] + "�� �¸��߽��ϴ�. ");
//            System.out.println(bet * 2 + "���� �����ϴ�.");
//            total += bet * 2; // ���� �ܾ׿� ���ñݾ� * 2 ����
//            System.out.println("���� ���� " + total + "�� �Դϴ�.");
//            break;
//         case 2:
//            System.out.println("\n���� �ܾ��� " + total + "�� �Դϴ�."); // ���� �ܾ� ��ȸ
//            continue;
//         case 3:
//            System.out.println("\n������ �ݾ��� �Է��ϼ���. ");
//            System.out.print(">> ");
//            total += Integer.parseInt(sc.nextLine()); // ���� �ܾ׿� ������ �ݾ� �߰�
//            continue;
//         case 0:
//            System.out.println("\n**** GoodBye ****");
//            System.exit(0); // ��������� ���α׷��� �����ϴ� �ڵ�
//         default:
//            System.out.println("\n�߸� �Է��߽��ϴ�. ");
//         }
//      }
//   }
//}
