import java.util.Scanner;

public class homeWork_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//	����ڷκ��� �� ���� ���� �Է� �޾� 1 ���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���
//	��, �Է��� ���� 1 ���� ũ�ų� ���ƾ� �մϴ�
//	���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��� �� ����ϼ���

//		System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
//		int num = Integer.parseInt(sc.nextLine());
//
//		if (num <= 0) {
//			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
//
//		} else {
//			for (int i = 1; i <= num; i++) {
//				System.out.print(i + " ");
//			}
//		}

//		�� ������ ��� ���� �����ϳ� , 1 �̸��� ���ڰ� �Էµƴٸ�
//		1�̻��� ���ڸ� �Է����ּ��� �� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���

//		int i = 1;
//		while (true) {
//			System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
//			int num = Integer.parseInt(sc.nextLine());
//
//			if (num <= 0) {
//				continue;
//			} else {
//				while (i <= num) {
//					System.out.print(i + " ");
//					i++;
//				}
//				break;
//			}
//		}

//		����ڷκ����� ���� ���� �Է� �޾� 1 ���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���
//		��, �Է��� ���� 1 ���� ũ�ų� ���ƾ� �մϴ�. 1 �̸��� ���ڰ� �Էµƴٸ�
//		1�̻��� ���ڸ� �Է����ּ��� �� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���

//		while (true) {
//			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� :");
//			int num = Integer.parseInt(sc.nextLine());
//			if (num <= 0) {
//				continue;
//			} else {
//				for (int i = 1; i <= num; num--) {
//					System.out.print(num + " ");
//				}
//			}
//			break;
//		}

//		1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���

//		int sum = 0;		
//		
//			System.out.print("������ �ϳ� �Է��ϼ��� :");
//			int num = Integer.parseInt(sc.nextLine());
//			for (int i = 1; i <= num-1; i++) {
//				sum += i;
//				System.out.print(i + " + ");
//			}
//			System.out.print(num + " = " + (sum + num));

//		����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���
//		���� 1 �̸��� ���ڰ� �Էµƴٸ� 1 �̻��� ���ڸ� �Է����ּ��� �� ����ϼ���

//		while (true) {
//			System.out.println();
//			System.out.println("ù��° ������ �Է��ϼ��� :");
//			int num1 = Integer.parseInt(sc.nextLine());
//			System.out.println("�ι�° ������ �Է��ϼ��� :");
//			int num2 = Integer.parseInt(sc.nextLine());
//
//			if (num1 == 0 || num2 == 0) {
//				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
//				continue;
//			} else if (num2 >= num1) {
//				System.out.println("ù ��° ���� : " + num1);
//				System.out.println("�� ��° ���� : " + num2);
//				while (num1 <= num2) {
//					System.out.print(num1 + " ");
//					num1 += 1;
//				}
//			} else {
//				System.out.println("ù ��° ���� : " + num1);
//				System.out.println("�� ��° ���� : " + num2);
//				while (num2 <= num1) {
//					System.out.print(num2 + " ");
//					num2 += 1;
//				}
//			}
//		}
//		����ڷκ��� �Է� ���� ������ ���� ����ϼ���
//		����ڷκ��� �Է� ���� ������ �ܺ��� 9 �ܱ��� ����ϼ���
//		�� 9 �� �ʰ��ϴ� ���ڰ� ������ 9 ������ ���ڸ� �Է����ּ��� �� ����ϼ���
//		�� ������ ��� ���� �����ϳ� , 9 �� �ʰ��ϴ� ���ڰ� �Էµƴٸ�
//		9 ������ ���ڸ� �Է����ּ��� �� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���
//		
//		int mul = 0;
//		while (true) {
//			System.out.println("���ڸ� �Է��ϼ���");
//			int num = Integer.parseInt(sc.nextLine());
//
//			if (num > 9) {
//				System.out.println("9 ������ ���ڸ� �Է����ּ���");
//				continue;
//			} else {
//				for(int j = num ; j <= 9 ; j++){
//					System.out.println("===== " + j + "�� =====");
//				}
//				for(int i = 1; i <= 9; i++) {
//					mul = num * i;
//					System.out.print(num + " * " + i + " = ");
//					System.out.println(mul);
//				}
//			}
//
//		}
//		����ڷκ��� ���� ���ڿ� ������ �Է� �޾�
//		������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ϼ���
//		�� ��µǴ� ���ڴ� �� 10 ���Դϴ�

//		System.out.println("���ڸ� �Է��ϼ���");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.println("������ �Է��ϼ���");
//		int num2 = Integer.parseInt(sc.nextLine());
//
//		for (int i = 1; i < 10; i++) {
//			num1 += num2;
//			System.out.print(num1 + " ");
//		}

//		���� �� ���� �����ڸ� �Է� �ް� �Էµ� �����ڿ� ���� �˸��� ����� ����ϼ���
//		��, �ش� ���α׷��� ������ �Է¿� exit ��� ���� ���� ������ ���� �ݺ��ϸ�
//		exit�� ������ ���α׷��� �����մϴ� �� ����ϰ� �����մϴ�
//		���� �����ڰ� �������̸鼭 �� ��° ������ 0 ���� ������
//		��0���� ���� �� �����ϴ� . �ٽ� �Է����ּ��� �� ����ϸ� ����
//		�����ڰ� ���� �� ���� �������Դϴ� . �ٽ� �Է����ּ��� ��� ����ϰ�
//		�� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϼ���.
//		boolean power = true;
//		while (power) {
//
//			System.out.println("�����ڸ� �Է��ϼ���");
//			String opr = sc.nextLine();
//			if (opr.equals("exit")) {
//				System.out.println("���α׷��� �����մϴ�.");
//				power = false;
//			} else {
//				System.out.println("����1�� �Է��ϼ���");
//				int num1 = Integer.parseInt(sc.nextLine());
//				System.out.println("����2�� �Է��ϼ���");
//				int num2 = Integer.parseInt(sc.nextLine());
//
//				switch (opr) {
//				case "+":
//					System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//					break;
//				case "-":
//					System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//					break;
//				case "*":
//					System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//					break;
//				case "/":
//					if (num1 == 0 || num2 == 0) {
//						System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
//						break;
//					} else {
//						System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//						break;
//					}
//				case "%":
//					System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
//					break;
//				default:
//					System.out.println("���� ������ �Դϴ�. �ٽ� �Է����ּ���.");
//					break;
//
//				}
//
//			}
//		}

//		������ ���� ���� ������ �����ϼ���
//		ex.
//		���� �Է� : 4
//		*
//		**
//		***
//		****

//		System.out.println("������ �Է��ϼ���");
//		int num = Integer.parseInt(sc.nextLine());
//		
//		for(int i = 1 ; i <= num ; i++) {
//			for(int j = 1 ; j <= i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		������ ���� ���� ������ �����ϼ���
//		ex.
//		�����Է� : 4
//		****
//		***
//		**
//		*
//		System.out.println("������ �Է��ϼ���");
//		int num = Integer.parseInt(sc.nextLine());
//		
//		for(int i = 0 ; i < num ; i++) {
//			for(int j = 0 ; j < num-i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		��ǻ�Ϳ� ���������� �����ϱ�.

//		int min = 1;
//		int max = 3;
//		int ran = (int) (Math.random() * (max - min + 1)) + min;
//		String rs = "";
//		System.out.println(ran);
//		switch (ran) {
//		case 1:
//			rs = "����";
//			break;
//		case 2:
//			rs = "����";
//			break;
//		case 3:
//			rs = "��";
//			break;
//		}
//
//		System.out.println("==== ���� ���� �� ���� ====");
//		System.out.println("�Ʒ��� ���� �� �ϳ��� �����ϼ���.");
//		System.out.println("1.���� 2.���� 3.��");
//
//		int user = Integer.parseInt(sc.nextLine());
//
//		if (user == 1) {
//			System.out.println("��ǻ��: " + rs + " �����: ����");
//			switch (ran) {
//			case 1:
//				System.out.println("�����ϴ�.");
//				break;
//			case 2:
//				System.out.println("�����ϴ�.");
//				break;
//			case 3:
//				System.out.println("�̰���ϴ�.");
//				break;
//			}
//		} else if (user == 2) {
//			System.out.println("��ǻ��: " + rs + " �����: ����");
//			switch (ran) {
//			case 1:
//				System.out.println("�̰���ϴ�.");
//				break;
//			case 2:
//				System.out.println("�����ϴ�.");
//				break;
//			case 3:
//				System.out.println("�����ϴ�.");
//				break;
//			}
//		} else if (user == 3) {
//			System.out.println("��ǻ��: " + rs + " �����: ��");
//			switch (ran) {
//			case 1:
//				System.out.println("�����ϴ�.");
//				break;
//			case 2:
//				System.out.println("�̰���ϴ�.");
//				break;
//			case 3:
//				System.out.println("�����ϴ�.");
//				break;
//			}
//		}

	}
}