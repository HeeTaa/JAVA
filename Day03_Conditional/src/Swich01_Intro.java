import java.util.Scanner;

public class Swich01_Intro {
	public static void main(String[] args) {
		// switch -> 조건문() 안에 있는 값이 case 뒤에 있는 값과 일치할 때 코드가 실행된다.

		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());

		switch (input) { // switch의 인수는 if와는 다르게 조건문이 들어가지 못한다. (int형과 string형 가능)
		case 1: // case 1 : 처럼 안에서 조건을 걸어준다 string의 경우에는 case "야호"
			System.out.println(1);
			break; // switch는 각 case마다 break를 걸어줘야한다.
		case 2:
			System.out.println(2);
			break;
		default: // if문의 else와 같은 역할
			System.out.println("해당하는 조건이 없습니다.");
		}
	}
}
