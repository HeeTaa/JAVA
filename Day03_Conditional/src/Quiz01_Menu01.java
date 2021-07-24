import java.util.Scanner;

public class Quiz01_Menu01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("메뉴선택하세요");
		String menu = sc.nextLine();

		if (menu.equals("아침")) {
			System.out.println("아침메뉴는 샌드위치입니다.");
		} else if (menu.equals("점심")) {
			System.out.println("점심메뉴는 햄버거입니다.");
		} else if (menu.equals("저녁")) {
			System.out.println("저녁메뉴는 집밥입니다.");
		} else if (menu.equals("야식")) {
			System.out.println("야식메뉴는 치킨입니다.");
		} else {
			System.out.println("해당하는 메뉴가 없습니다.");
		}

	}
}
