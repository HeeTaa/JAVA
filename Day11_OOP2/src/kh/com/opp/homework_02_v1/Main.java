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

			System.out.println("===== 학생 관리 프로그램 =====");
			System.out.println("메뉴를 선택하세요. (종료버튼 : q)");
			System.out.println();
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 목록 확인");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 삭제");
			System.out.print(">> ");
			Scanner sc = new Scanner(System.in);
			char inMenu = sc.nextLine().charAt(0);

			switch (inMenu) {
			case '1':
				System.out.println("===== 학생 정보 등록 =====");
				System.out.print("번호를 입력하세요 >> ");
				no = Integer.parseInt(sc.nextLine());
				System.out.print("이름을 입력하세요 >> ");
				name = sc.nextLine();
				System.out.print("나이를 입력하세요 >> ");
				age = Integer.parseInt(sc.nextLine());
				System.out.print("성별을 입력하세요(남/여) >> ");
				gender = sc.nextLine().charAt(0);
				// 지정해놓은 배열이 다 찼을 경우
				// 방법 1
				// index ==5 이고 student.length == 5 이면 배열이 풀로 찬 상태이므로 배열크기를 늘려주도록한다.
				if (index == student.length) {
//					Student[] temp = new Student[student.length * 2];
//					// 2배크기의 temp배열에 student배열을 담아준다
//					for (int i = 0; i < student.length; i++) {
//						temp[i] = student[i];

					// 방법 2
//						배열값복사
//						System.arraycopy(student, 0, temp, 0,student.length);  // System.arraycopy(원본배열 , 시작인덱스 , 받을 배열 , 시작인덱스 , 몇개의 값을 옮길건지);						
//					System.arraycopy(student, 0, temp, 0, student.length);					
//					}
					// 2배의 크기가 된 temp배열의 주소값을 student배열의 주소값에 넣어준다
//					student = temp;

					// 방법 3
//					배열크기 확장
					student = Arrays.copyOf(student, student.length); // Arrays.copyOf(원본배열, 배열확장크기);
				}

				student[index++] = new Student(no, name, age, gender);
				System.out.println("저장되었습니다.");
				break;
			case '2':
				System.out.println("===== 학생 목록 확인 =====");
				for (int i = 0; i < student.length; i++) {
					if (student[i] != null)
						System.out.println(student[i].getNo() + " : " + student[i].getName() + " : "
								+ student[i].getAge() + " : " + student[i].getGender());
				}
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

				student[no - 1].setName(name);
				student[no - 1].setAge(age);
				student[no - 1].setGender(gender);
				System.out.println("학생정보 수정이 완료되었습니다. ");
				break;
			case '4':
				System.out.println("===== 학생 정보 삭제 =====");
				System.out.print("삭제할 학생의 번호를 입력하세요 >> ");
				no = Integer.parseInt(sc.nextLine());

//				student[no - 1] = null;
				for (int i = 0; i < student.length; i++) {
					if (student[i] != null && no == student[i].getNo()) {
						student[i] = null;
						System.out.println("학생정보가 삭제되었습니다.");
						index--;
						break;
					}
				}

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
