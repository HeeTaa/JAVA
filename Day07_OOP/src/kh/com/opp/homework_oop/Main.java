package kh.com.opp.homework_oop;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("id�� �Է��ϼ���");
		int inId = Integer.parseInt(sc.nextLine());
		System.out.println("�̸��� �Է��ϼ���");
		String inName = sc.nextLine();
		System.out.println("����ó�� �Է��ϼ���");
		String inContact = sc.nextLine();

		Person p = new Person(inId,inName,inContact);

		System.out.println(p.getId() + p.getName() + p.getContact());

		p.setName("Tom");
		p.setContact("01012345555");
		p.printAll();

////////////////////////////////////////////////////////////////////

		Scanner sc1 = new Scanner(System.in);

		System.out.println("�ۼ��ڸ� �Է��ϼ���");
		String inWrt = sc1.nextLine();
		System.out.println("�޽����� �Է��ϼ���");
		String inMsg = sc1.nextLine();
		System.out.println("�ۼ����� �Է��ϼ���");
		String inDay = sc1.nextLine();

		Message m = new Message(inWrt,inMsg,inDay);
		System.out.println(m.getWriter() + m.getMessage() + m.getDay());

		m.setWriter("Alley");
		m.setMessage("�ȳ��ϼ���?");
		m.printAll();
		
	}

}
