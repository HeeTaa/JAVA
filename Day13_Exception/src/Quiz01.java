import java.util.Scanner;

public class Quiz01 {

	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("�� �Է�>> ");
				int num = Integer.parseInt(sc.nextLine());
				return num;
			} catch (Exception e) {
				System.out.println("���ڸ� �Է� �����մϴ�.");
				continue;
			}
		}
	}

	public static void main(String[] args) {

		// �̴� ����, ����ڿ��� int�� �� ���� �����ڸ� �Է¹޾Ƽ�
		// ��Ģ���길 ���ִ� ���α׷�
		// 1. ���ڰ� �ƴ� ���ڿ��� �Է��� ���
		// 2. 0���� ���ڸ� ������� �� ���
		Scanner sc = new Scanner(System.in);

		while (true) {

//			System.out.println("ù ��° �� �Է�>> ");
//			while (true) {
//				try {
//					num1 = Integer.parseInt(sc.nextLine());
//					break;
//				} catch (Exception e) {
//					System.out.println("���ڸ� �Է� �����մϴ�.");
//					continue;
//				}
//			}
			int num1 = getNumber();
			System.out.println("�����Է�>> ");
			char tran = sc.nextLine().charAt(0);

			int num2 = getNumber();
//			System.out.println("�� ��° �� �Է�>> ");
//			while (true) {
//				try {
//					num2 = Integer.parseInt(sc.nextLine());
//					break;
//				} catch (Exception e) {
//					System.out.println("���ڸ� �Է� �����մϴ�.");
//					continue;
//				}
//			}

			switch (tran) {
			case '+':
				num1 += num2;
				break;
			case '-':
				num1 -= num2;
				break;
			case '*':
				num1 *= num2;
				break;
			case '/':
				try {
					num1 /= num2;
				} catch (Exception e) {
					System.out.println("0���� ������ �����ϴ�.");
				}
				break;
			default:
				System.out.println("�ùٸ� �����ڰ� �ƴմϴ�.");
				continue;
			}
			System.out.println("���:" + num1);
		}
	}
}
