package kh.com.opp.homework_02_v1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int no = 0;
		String name = " ";
		int age = 0;
		char gender = ' ';
		Student[] student = new Student[5];
		int index = 0;

		while (true) {

			System.out.println("===== �л� ���� ���α׷� =====");
			System.out.println("�޴��� �����ϼ���. (�����ư : q)");
			System.out.println();
			System.out.println("1. �л� ���� ���");
			System.out.println("2. �л� ��� Ȯ��");
			System.out.println("3. �л� ���� ����");
			System.out.println("4. �л� ���� ����");
			System.out.print(">> ");
			Scanner sc = new Scanner(System.in);
			char inMenu = sc.nextLine().charAt(0);

			switch (inMenu) {
			case '1':
				System.out.println("===== �л� ���� ��� =====");
				System.out.print("��ȣ�� �Է��ϼ��� >> ");
				no = Integer.parseInt(sc.nextLine());
				System.out.print("�̸��� �Է��ϼ��� >> ");
				name = sc.nextLine();
				System.out.print("���̸� �Է��ϼ��� >> ");
				age = Integer.parseInt(sc.nextLine());
				System.out.print("������ �Է��ϼ���(��/��) >> ");
				gender = sc.nextLine().charAt(0);
				// �����س��� �迭�� �� á�� ���
				// ��� 1
				// index ==5 �̰� student.length == 5 �̸� �迭�� Ǯ�� �� �����̹Ƿ� �迭ũ�⸦ �÷��ֵ����Ѵ�.
				if (index == student.length) {
//					Student[] temp = new Student[student.length * 2];
//					// 2��ũ���� temp�迭�� student�迭�� ����ش�
//					for (int i = 0; i < student.length; i++) {
//						temp[i] = student[i];

					// ��� 2
//						�迭������
//						System.arraycopy(student, 0, temp, 0,student.length);  // System.arraycopy(�����迭 , �����ε��� , ���� �迭 , �����ε��� , ��� ���� �ű����);						
//					System.arraycopy(student, 0, temp, 0, student.length);					
//					}
					// 2���� ũ�Ⱑ �� temp�迭�� �ּҰ��� student�迭�� �ּҰ��� �־��ش�
//					student = temp;

					// ��� 3
//					�迭ũ�� Ȯ��
					student = Arrays.copyOf(student, student.length); // Arrays.copyOf(�����迭, �迭Ȯ��ũ��);
				}

				student[index++] = new Student(no, name, age, gender);
				System.out.println("����Ǿ����ϴ�.");
				break;
			case '2':
				System.out.println("===== �л� ��� Ȯ�� =====");
				for (int i = 0; i < student.length; i++) {
					if (student[i] != null)
						System.out.println(student[i].getNo() + " : " + student[i].getName() + " : "
								+ student[i].getAge() + " : " + student[i].getGender());
				}
				break;
			case '3':
				System.out.println("===== �л� ���� ���� =====");
				System.out.print("������ �л��� ��ȣ�� �Է��ϼ��� >> ");
				no = Integer.parseInt(sc.nextLine());
				System.out.print("�̸��� �����ϼ��� >> ");
				name = sc.nextLine();
				System.out.print("���̸� �����ϼ��� >> ");
				age = Integer.parseInt(sc.nextLine());
				System.out.print("������ �����ϼ���(��/��) >> ");
				gender = sc.nextLine().charAt(0);

				student[no - 1].setName(name);
				student[no - 1].setAge(age);
				student[no - 1].setGender(gender);
				System.out.println("�л����� ������ �Ϸ�Ǿ����ϴ�. ");
				break;
			case '4':
				System.out.println("===== �л� ���� ���� =====");
				System.out.print("������ �л��� ��ȣ�� �Է��ϼ��� >> ");
				no = Integer.parseInt(sc.nextLine());

//				student[no - 1] = null;
				for (int i = 0; i < student.length; i++) {
					if (student[i] != null && no == student[i].getNo()) {
						student[i] = null;
						System.out.println("�л������� �����Ǿ����ϴ�.");
						index--;
						break;
					}
				}

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
