import java.util.Scanner;

public class Quiz01_Menu01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�޴������ϼ���");
		String menu = sc.nextLine();

		if (menu.equals("��ħ")) {
			System.out.println("��ħ�޴��� ������ġ�Դϴ�.");
		} else if (menu.equals("����")) {
			System.out.println("���ɸ޴��� �ܹ����Դϴ�.");
		} else if (menu.equals("����")) {
			System.out.println("����޴��� �����Դϴ�.");
		} else if (menu.equals("�߽�")) {
			System.out.println("�߽ĸ޴��� ġŲ�Դϴ�.");
		} else {
			System.out.println("�ش��ϴ� �޴��� �����ϴ�.");
		}

	}
}
