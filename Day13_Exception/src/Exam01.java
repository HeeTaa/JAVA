import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ����ó�� : try ~ catch
//		try {
//			//���� �߻� ���� �ڵ�
//		}catch(Exception e) {
//			//���� �߻��� ó���� �ڵ�
//		}

		// ���ڸ� �Է��ؾ��ϴµ� ���ڿ��� �Է��ϴ� ���ܻ�Ȳ
		System.out.println("���ڸ� �Է��ϼ���>> ");
		try {
			int no = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("���ڰ� �ƴմϴ�.");
		}

	}
}
