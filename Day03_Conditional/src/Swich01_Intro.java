import java.util.Scanner;

public class Swich01_Intro {
	public static void main(String[] args) {
		// switch -> ���ǹ�() �ȿ� �ִ� ���� case �ڿ� �ִ� ���� ��ġ�� �� �ڵ尡 ����ȴ�.

		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());

		switch (input) { // switch�� �μ��� if�ʹ� �ٸ��� ���ǹ��� ���� ���Ѵ�. (int���� string�� ����)
		case 1: // case 1 : ó�� �ȿ��� ������ �ɾ��ش� string�� ��쿡�� case "��ȣ"
			System.out.println(1);
			break; // switch�� �� case���� break�� �ɾ�����Ѵ�.
		case 2:
			System.out.println(2);
			break;
		default: // if���� else�� ���� ����
			System.out.println("�ش��ϴ� ������ �����ϴ�.");
		}
	}
}
