package kh.com.time.student01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Student ��� ���α׷�
		// Student ��� �ÿ� register_date �ʵ�� �Է�X
		// Student ����ϸ� �ڵ����� ����� ��¥�� �ð��� ����ǵ��� ����ÿ�.
		// �л��� ������ ����Ҷ� ��ȣ,�̸�,�����(yyyy�� MM�� dd�� hh�� mm��)
		
		ArrayList<Student> std = new ArrayList<>();
		
		while (true) {
			
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("��ȣ�Է�");
			int no = Integer.parseInt(sc.nextLine());
			System.out.println("�̸��Է�");
			String name = sc.nextLine();
			std.add(new Student(no, name));
			
			
			for (Student s : std) {
				
				System.out.println(std);
			}
		}

	}
}
