import java.util.Scanner;

public class If01_intro {
	public static void main(String[] args) {
		// if -> ���ǹ��� ���϶� if�� ���� �ڵ尡 ����ǰ� , �����̶�� �ǳ� ��.
/*
		Scanner sc = new Scanner(System.in);

		System.out.println("�Է°� >>");
		int num = Integer.parseInt(sc.nextLine());

		if (num == 1) {
			System.out.println("�Է��� ���� 1�Դϴ�.");
		} else if (num == 2) {
			System.out.println("�Է��� ���� 2�Դϴ�.");
		} else {
			System.out.println("�Է��� ���� 1�̳�2�� �ƴմϴ�.");
		}
*/
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸����Է��ϼ���");
		String str = sc.nextLine();
		System.out.println("���ڸ��Է��ϼ���");
		int num = Integer.parseInt(sc.nextLine());
		
		if(str.equals("�̸�")) {             //if�ȿ� if �� ��øif���� && �� ����ϰ� �����Ѵ�. ex) str.equals("�̸�") ==
			if(num == 1) {
				System.out.println("�������Դϴ�.");
			}
			
		}
	}

}
