import java.util.Scanner;

public class Swich02_Exam {
	public static void main(String[] args) {
		// ����ڿ��� ���̸� �Է¹ް� ���� 1~19���̸� �̼�����/20~29�� 20��/30~39�� 30��/40~49�� 40��
		// 20��,30��,40�� �߿��� ���ڸ��� 5��� �߹��Դϴ�.
		// if���� swich���� ��� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int age = Integer.parseInt(sc.nextLine());

		if (age >= 1 && age <= 19) {
			System.out.println("�̼������Դϴ�.");
		} else if (age >= 20 && age <= 29) {
			System.out.println("20���Դϴ�.");
		} else if (age >= 30 && age <= 39) {
			System.out.println("30���Դϴ�.");
		} else if (age >= 40 && age <= 49) {
			System.out.println("40���Դϴ�.");
		}

	}
}
