package kh.com.time.student02;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Student ��� ���α׷�
		// ������� ����ڿ��� ���� �Է¹޾Ƽ�(String) -> register_date�ʵ忡 long������ ����
		// ����� �Է� ����(0000/00/00)
		// �л��� ������ ����Ҷ� ��ȣ,�̸�,�����(yyyy�� MM�� dd��)
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		
		while (true) {
					
			//�Է�
			System.out.println("��ȣ�Է�");
			int no = Integer.parseInt(sc.nextLine());
			System.out.println("�̸��Է�");
			String name = sc.nextLine();
			System.out.println("��¥�Է�");
			String register_date = sc.nextLine();
			list.add(new Student(no, name,register_date));
			
			//���
			System.out.println("��ȣ\t�̸�\t�����");
			for (Student s : list) {		
				System.out.println(list+"\t");
			}
		}

	}
}
