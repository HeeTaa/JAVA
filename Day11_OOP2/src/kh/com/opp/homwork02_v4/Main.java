package kh.com.opp.homwork02_v4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static char exChar() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("성별을 입력하세요(남/여) >> ");
				char gender = sc.nextLine().charAt(0);
				return gender;
			} catch (Exception e) {
				System.out.println("'남','여' 만 입력 가능합니다.");
				continue;
			}
		}
	}

	public static int exInt(String type) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (type.equals("no")) {
					System.out.println("번호를 입력하세요 >> ");
					int no = Integer.parseInt(sc.nextLine());
					return no;
				} else if (type.equals("age"))
					System.out.println("나이를 입력하세요 >> ");
				    int age = Integer.parseInt(sc.nextLine());
				    return age;
			} catch (Exception e) {
				System.out.println("숫자만 입력 가능합니다.");
				continue;
			}
		}
	}

	public static void main(String[] args) {

		StudentDAO stDAO = new StudentDAO();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===== 학생 관리 프로그램 =====");
			System.out.println("메뉴를 선택하세요. (종료버튼 : q)");
			System.out.println();
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 목록 확인");
			System.out.println("3. 학생 정보 확인");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.print(">> ");
			char inMenu = sc.nextLine().charAt(0);

			switch (inMenu) {
			case '1':
				System.out.println("===== 학생 정보 등록 =====");
				int no = exInt("no");
				if (stDAO.doesNoExist(no) == true) {
					System.out.println("이미 존재하는 번호입니다.");
					continue;
				}
				System.out.print("이름을 입력하세요 >> ");
				String name = sc.nextLine();
				int age = exInt("age");
				char gender = exChar();
				stDAO.sAdd(new StudentDTO(no, name, age, gender));
				System.out.println("저장되었습니다.");
				break;

			case '2':
				System.out.println("===== 학생 목록 확인 =====");
				ArrayList<StudentDTO> stDTO = stDAO.printAll();
				for (StudentDTO std : stDTO) {
					System.out.println(std);
				}
				break;

			case '3':
				System.out.println("===== 학생 정보 확인 =====");
				no = Integer.parseInt(sc.nextLine());
				StudentDTO std = stDAO.selectByNo(no);
				System.out.println(std);
				break;

			case '4':
				System.out.println("===== 학생 정보 수정 =====");
				System.out.print("수정할 학생의 번호를 입력하세요 >> ");
				no = exInt("no");
				System.out.print("이름을 수정하세요 >> ");
				name = sc.nextLine();
				age = exInt("age");
				gender = exChar();
				stDAO.modify(new StudentDTO(no, name, age, gender));
				System.out.println("학생정보 수정이 완료되었습니다. ");
				break;

			case '5':
				System.out.println("===== 학생 정보 삭제 =====");
				System.out.print("삭제할 학생의 번호를 입력하세요 >> ");
				no = exInt("no");
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