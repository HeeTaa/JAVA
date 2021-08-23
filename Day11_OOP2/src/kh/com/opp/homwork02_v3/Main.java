package kh.com.opp.homwork02_v3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
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
				System.out.print("��ȣ�� �Է��ϼ��� >> ");
				int no = Integer.parseInt(sc.nextLine());
				if (stDAO.doesNoExist(no) == true) {
					System.out.println("�̹� �����ϴ� ��ȣ�Դϴ�.");
					continue;
				}

				System.out.print("�̸��� �Է��ϼ��� >> ");
				String name = sc.nextLine();
				System.out.print("���̸� �Է��ϼ��� >> ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("������ �Է��ϼ���(��/��) >> ");
				char gender = sc.nextLine().charAt(0);
				stDAO.add(new StudentDTO(no, name, age, gender));
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
				no = Integer.parseInt(sc.nextLine());
				System.out.print("�̸��� �����ϼ��� >> ");
				name = sc.nextLine();
				System.out.print("���̸� �����ϼ��� >> ");
				age = Integer.parseInt(sc.nextLine());
				System.out.print("������ �����ϼ���(��/��) >> ");
				gender = sc.nextLine().charAt(0);
				stDAO.modify(new StudentDTO(no, name, age, gender));
				System.out.println("�л����� ������ �Ϸ�Ǿ����ϴ�. ");
				break;
			case '5':
				System.out.println("===== �л� ���� ���� =====");
				System.out.print("������ �л��� ��ȣ�� �Է��ϼ��� >> ");
				no = Integer.parseInt(sc.nextLine());

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