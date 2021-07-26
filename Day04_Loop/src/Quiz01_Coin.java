import java.util.Scanner;

public class Quiz01_Coin {
	public static void main(String[] args) {
		// 동전 앞 뒤 맞추기 게임(1이면 앞면 2면 뒷면)
		// Math.random()을 이용해서 1혹은 2 두 수중 하나를 뽑아내고
		// 사용자가 앞/뒤를 입력했을때 정답인지 아닌지 출력하시오.
		Scanner sc = new Scanner(System.in);

		int min = 1;
		int max = 2;
		int ranNum = (int) (Math.random() * (max - min + 1)) + min;
		String rs = null;

		if (ranNum == 1) {
			rs = "앞면";
		} else if (ranNum == 2) {
			rs = "뒷면";
		}

		System.out.println("수를입력하시오");
		int num = Integer.parseInt(sc.nextLine());

		if (ranNum == num) {
			System.out.println(rs);
			System.out.println("정답입니다.");

		} else if (ranNum != num) {
			System.out.println(rs);
			System.out.println("틀렸습니다.");
		}

	}
}
