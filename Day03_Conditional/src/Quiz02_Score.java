import java.util.Scanner;

public class Quiz02_Score {
	public static void main(String[] args) {
		// �Է¹��� ������ 100���̶�� �о������ 70~99���̶�� ������� 69�����ϸ� ������� 69�������߿� 30�����ϸ� ���������� �߰�
		Scanner sc = new Scanner(System.in);

		System.out.println("�������Է����ּ���");
		int score = Integer.parseInt(sc.nextLine());

		if (score == 100) {
			System.out.println("�о������");
		} else if (score >= 70 && score <= 99) {
			System.out.println("���� ���");
		} else if (score >= 0 && score <= 69) {
			System.out.println("����� ���");
			if (score >= 0 && score <= 30) {
				System.out.println("����������");
			}
		} else {
			System.out.println("0~100�� ���̸� �Է��ϼ���");
		}

	}
}
