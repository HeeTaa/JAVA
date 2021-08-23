import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 예외처리 : try ~ catch
//		try {
//			//예외 발생 예상 코드
//		}catch(Exception e) {
//			//예외 발생시 처리할 코드
//		}

		// 숫자를 입력해야하는데 문자열을 입력하는 예외상황
		System.out.println("숫자를 입력하세요>> ");
		try {
			int no = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		}

	}
}
