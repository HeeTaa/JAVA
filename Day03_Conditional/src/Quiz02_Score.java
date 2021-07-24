import java.util.Scanner;

public class Quiz02_Score {
	public static void main(String[] args) {
		// 입력받은 점수가 100점이라면 학업우수상 70~99점이라면 시험통과 69점이하면 재시험대상 69점이하중에 30점이하면 보충수업대상 추가
		Scanner sc = new Scanner(System.in);

		System.out.println("점수를입력해주세요");
		int score = Integer.parseInt(sc.nextLine());

		if (score == 100) {
			System.out.println("학업우수상");
		} else if (score >= 70 && score <= 99) {
			System.out.println("시험 통과");
		} else if (score >= 0 && score <= 69) {
			System.out.println("재시험 대상");
			if (score >= 0 && score <= 30) {
				System.out.println("보충수업대상");
			}
		} else {
			System.out.println("0~100점 사이를 입력하세요");
		}

	}
}
