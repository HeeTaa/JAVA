import java.util.Scanner;

public class Swich02_Exam {
	public static void main(String[] args) {
		// 사용자에게 나이를 입력받고 만약 1~19살이면 미성년자/20~29살 20대/30~39살 30대/40~49살 40대
		// 20대,30대,40대 중에서 뒷자리가 5라면 중반입니다.
		// if문과 swich문을 모두 사용하시오.
		Scanner sc = new Scanner(System.in);
		int age = Integer.parseInt(sc.nextLine());

		if (age >= 1 && age <= 19) {
			System.out.println("미성년자입니다.");
		} else if (age >= 20 && age <= 29) {
			System.out.println("20대입니다.");
		} else if (age >= 30 && age <= 39) {
			System.out.println("30대입니다.");
		} else if (age >= 40 && age <= 49) {
			System.out.println("40대입니다.");
		}

	}
}
