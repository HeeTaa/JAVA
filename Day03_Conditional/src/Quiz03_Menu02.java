import java.util.Scanner;

public class Quiz03_Menu02 {
	public static void main(String[] args) {
			// switch������ �޴��� ������
		Scanner sc = new Scanner(System.in);

		System.out.println("�޴��� �Է����ּ���");
		String menu = sc.nextLine();
		switch (menu) {
		case "��ħ":
			System.out.println("��ħ�޴��� Ŀ���Դϴ�.");
			break;
		case "����":
			System.out.println("���ɸ޴��� ��ġ�Դϴ�.");
			break;
		case "����":
			System.out.println("����޴��� �����Դϴ�.");
			break;
		case "�߽�":
			System.out.println("����޴��� �����Դϴ�.");
			break;
		default:
			System.out.println("�ش��ϴ� �޴��� �����ϴ�.");

		}

	}
}
