import java.util.Scanner;

public class Quiz01_Coin {
	public static void main(String[] args) {
		// ���� �� �� ���߱� ����(1�̸� �ո� 2�� �޸�)
		// Math.random()�� �̿��ؼ� 1Ȥ�� 2 �� ���� �ϳ��� �̾Ƴ���
		// ����ڰ� ��/�ڸ� �Է������� �������� �ƴ��� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);

		int min = 1;
		int max = 2;
		int ranNum = (int) (Math.random() * (max - min + 1)) + min;
		String rs = null;

		if (ranNum == 1) {
			rs = "�ո�";
		} else if (ranNum == 2) {
			rs = "�޸�";
		}

		System.out.println("�����Է��Ͻÿ�");
		int num = Integer.parseInt(sc.nextLine());

		if (ranNum == num) {
			System.out.println(rs);
			System.out.println("�����Դϴ�.");

		} else if (ranNum != num) {
			System.out.println(rs);
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}

	}
}
