package kh.com.opp.homework_oop;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("id를 입력하세요");
		int inId = Integer.parseInt(sc.nextLine());
		System.out.println("이름을 입력하세요");
		String inName = sc.nextLine();
		System.out.println("연락처를 입력하세요");
		String inContact = sc.nextLine();

		Person p = new Person(inId,inName,inContact);

		System.out.println(p.getId() + p.getName() + p.getContact());

		p.setName("Tom");
		p.setContact("01012345555");
		p.printAll();

////////////////////////////////////////////////////////////////////

		Scanner sc1 = new Scanner(System.in);

		System.out.println("작성자를 입력하세요");
		String inWrt = sc1.nextLine();
		System.out.println("메시지를 입력하세요");
		String inMsg = sc1.nextLine();
		System.out.println("작성일을 입력하세요");
		String inDay = sc1.nextLine();

		Message m = new Message(inWrt,inMsg,inDay);
		System.out.println(m.getWriter() + m.getMessage() + m.getDay());

		m.setWriter("Alley");
		m.setMessage("안녕하세요?");
		m.printAll();
		
	}

}
