package kh.com.opp.homework02_oop;

import java.util.Scanner;

public class Veneziagame {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;

		System.out.println("===== ����ġ�� ���ӿ� ���� �� ȯ���մϴ� =====");
		System.out.println("1. ���� ����");
		System.out.println("2. ���� ����");
		System.out.print("�޴��� �����ϼ��� >>");
		int inMenu = Integer.parseInt(sc.nextLine());
		if (inMenu == 1) {

			long start = System.currentTimeMillis();

			System.out.println("���� Start!");
			String[] str = new String[] { "������ħ", "������", "�μ�����", "�̱ۺ���", "�͸��䰢", "���굹��", "�ݱ�����", "�ٶ����", "�������" };
			while (true) {
				for (int i = 0; i < str.length; i++) {
					System.out.print(str[i] + " ");
				}
				System.out.println();
				System.out.print("�Է� >> ");
				String in = sc.nextLine();
				for (int i = 0; i < str.length; i++) {
					if (str[i].equals(in)) {
						str[i] = " ";
						count++;
					}
				}
				if (count == 9) {
					break;
				}
			}
			System.out.println("Clear !");
			long end = System.currentTimeMillis();
			System.out.println("�÷��� �ð� : " + (end - start) / 1000.0 + "��");
			System.out.println("===== Goodbye Venezia:) =====");
		}
	}
}
