import java.util.Scanner;

public class Quiz01 {

	public static int getNumber() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("수 입력>> ");
				int num = Integer.parseInt(sc.nextLine());
				return num;
			} catch (Exception e) {
				System.out.println("숫자만 입력 가능합니다.");
				continue;
			}
		}
	}

	public static void main(String[] args) {

		// 미니 계산기, 사용자에게 int형 두 수와 연산자를 입력받아서
		// 사칙연산만 해주는 프로그램
		// 1. 숫자가 아닌 문자열을 입력할 경우
		// 2. 0으로 숫자를 나누라고 할 경우
		Scanner sc = new Scanner(System.in);

		while (true) {

//			System.out.println("첫 번째 수 입력>> ");
//			while (true) {
//				try {
//					num1 = Integer.parseInt(sc.nextLine());
//					break;
//				} catch (Exception e) {
//					System.out.println("숫자만 입력 가능합니다.");
//					continue;
//				}
//			}
			int num1 = getNumber();
			System.out.println("연산입력>> ");
			char tran = sc.nextLine().charAt(0);

			int num2 = getNumber();
//			System.out.println("두 번째 수 입력>> ");
//			while (true) {
//				try {
//					num2 = Integer.parseInt(sc.nextLine());
//					break;
//				} catch (Exception e) {
//					System.out.println("숫자만 입력 가능합니다.");
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
					System.out.println("0으로 나눌수 없습니다.");
				}
				break;
			default:
				System.out.println("올바른 연산자가 아닙니다.");
				continue;
			}
			System.out.println("결과:" + num1);
		}
	}
}
