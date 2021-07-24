import java.util.Scanner;

public class Quiz03_Menu02 {
	public static void main(String[] args) {
			// switch문으로 메뉴판 만들어보기
		Scanner sc = new Scanner(System.in);

		System.out.println("메뉴를 입력해주세요");
		String menu = sc.nextLine();
		switch (menu) {
		case "아침":
			System.out.println("아침메뉴는 커피입니다.");
			break;
		case "점심":
			System.out.println("점심메뉴는 김치입니다.");
			break;
		case "저녁":
			System.out.println("저녁메뉴는 도연입니다.");
			break;
		case "야식":
			System.out.println("저녁메뉴는 도연입니다.");
			break;
		default:
			System.out.println("해당하는 메뉴가 없습니다.");

		}

	}
}
