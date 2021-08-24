package kh.com.opp.homwork02_v2;

import java.util.Arrays;
import java.util.Scanner;

import kh.com.opp.homework_02_v1.Student;

public class Main {
	public static void main(String[] args) {
		
		StudentDAO stDAO = new StudentDAO();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===== 학생 관리 프로그램 =====");
			System.out.println("메뉴를 선택하세요. (종료버튼 : q)");
			System.out.println();
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 목록 확인");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 삭제");
			System.out.print(">> ");
			char inMenu = sc.nextLine().charAt(0);

			switch (inMenu) {
			case '1':
				System.out.println("===== 학생 정보 등록 =====");
				System.out.print("번호를 입력하세요 >> ");
				int no = Integer.parseInt(sc.nextLine());
				System.out.print("이름을 입력하세요 >> ");
				String name = sc.nextLine();
				System.out.print("나이를 입력하세요 >> ");
				int age = Integer.parseInt(sc.nextLine());
				System.out.print("성별을 입력하세요(남/여) >> ");
				char gender = sc.nextLine().charAt(0);
				stDAO.increase();
				stDAO.add(new StudentDTO(no, name, age, gender));
				System.out.println("저장되었습니다.");
				break;
			case '2':
				System.out.println("===== 학생 목록 확인 =====");
				stDAO.printAll();
				break;
			case '3':
				System.out.println("===== 학생 정보 수정 =====");
				System.out.print("수정할 학생의 번호를 입력하세요 >> ");
				no = Integer.parseInt(sc.nextLine());
				System.out.print("이름을 수정하세요 >> ");
				name = sc.nextLine();
				System.out.print("나이를 수정하세요 >> ");
				age = Integer.parseInt(sc.nextLine());
				System.out.print("성별을 수정하세요(남/여) >> ");
				gender = sc.nextLine().charAt(0);
				stDAO.modify(no, name, age, gender);
				System.out.println("학생정보 수정이 완료되었습니다. ");
				break;
			case '4':
				System.out.println("===== 학생 정보 삭제 =====");
				System.out.print("삭제할 학생의 번호를 입력하세요 >> ");
				no = Integer.parseInt(sc.nextLine());
				stDAO.delete(no);
				System.out.println("학생정보가 삭제되었습니다.");
				break;
			case 'q':
				System.out.println("프로그램을 종료합니다.");
				System.out.println("===== Bye Bye =====");
				System.exit(0);
			default:
				System.out.println("다시 입력해주세요.");
				continue;
			}

		}
	}
}