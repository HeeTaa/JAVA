package kh.com.opp.homwork02_v4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static char exChar() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("������ �Է��ϼ���(��/��) >> ");
				char gender = sc.nextLine().charAt(0);
				return gender;
			} catch (Exception e) {
				System.out.println("'��','��' �� �Է� �����մϴ�.");
				continue;
			}
		}
	}

	public static int exInt(String type) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (type.equals("no")) {
					System.out.println("��ȣ�� �Է��ϼ��� >> ");
					int no = Integer.parseInt(sc.nextLine());
					return no;
				} else if (type.equals("age"))
					System.out.println("���̸� �Է��ϼ��� >> ");
				    int age = Integer.parseInt(sc.nextLine());
				    return age;
			} catch (Exception e) {
				System.out.println("���ڸ� �Է� �����մϴ�.");
				continue;
			}
		}
	}

	public static void main(String[] args) {

		StudentDAO stDAO = new StudentDAO();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===== �л� ���� ���α׷� =====");
			System.out.println("�޴��� �����ϼ���. (�����ư : q)");
			System.out.println();
			System.out.println("1. �л� ���� ���");
			System.out.println("2. �л� ��� Ȯ��");
			System.out.println("3. �л� ���� Ȯ��");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �л� ���� ����");
			System.out.print(">> ");
			char inMenu = sc.nextLine().charAt(0);

			switch (inMenu) {
			case '1':
				System.out.println("===== �л� ���� ��� =====");
				int no = exInt("no");
				if (stDAO.doesNoExist(no) == true) {
					System.out.println("�̹� �����ϴ� ��ȣ�Դϴ�.");
					continue;
				}
				System.out.print("�̸��� �Է��ϼ��� >> ");
				String name = sc.nextLine();
				int age = exInt("age");
				char gender = exChar();
				stDAO.sAdd(new StudentDTO(no, name, age, gender));
				System.out.println("����Ǿ����ϴ�.");
				break;

			case '2':
				System.out.println("===== �л� ��� Ȯ�� =====");
				ArrayList<StudentDTO> stDTO = stDAO.printAll();
				for (StudentDTO std : stDTO) {
					System.out.println(std);
				}
				break;

			case '3':
				System.out.println("===== �л� ���� Ȯ�� =====");
				no = Integer.parseInt(sc.nextLine());
				StudentDTO std = stDAO.selectByNo(no);
				System.out.println(std);
				break;

			case '4':
				System.out.println("===== �л� ���� ���� =====");
				System.out.print("������ �л��� ��ȣ�� �Է��ϼ��� >> ");
				no = exInt("no");
				System.out.print("�̸��� �����ϼ��� >> ");
				name = sc.nextLine();
				age = exInt("age");
				gender = exChar();
				stDAO.modify(new StudentDTO(no, name, age, gender));
				System.out.println("�л����� ������ �Ϸ�Ǿ����ϴ�. ");
				break;

			case '5':
				System.out.println("===== �л� ���� ���� =====");
				System.out.print("������ �л��� ��ȣ�� �Է��ϼ��� >> ");
				no = exInt("no");
				stDAO.delete(no);
				System.out.println("�л������� �����Ǿ����ϴ�.");
				break;

			case 'q':
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println("===== Bye Bye =====");
				System.exit(0);

			default:
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}

		}
	}
}