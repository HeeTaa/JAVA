import java.util.Scanner;

public class homeWork_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//	사용자로부터 한 개의 값을 입력 받아 1 부터 그 숫자까지의 숫자들을 모두 출력하세요
//	단, 입력한 수는 1 보다 크거나 같아야 합니다
//	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요 를 출력하세요

//		System.out.println("1이상의 숫자를 입력하세요.");
//		int num = Integer.parseInt(sc.nextLine());
//
//		if (num <= 0) {
//			System.out.println("1이상의 숫자를 입력해주세요.");
//
//		} else {
//			for (int i = 1; i <= num; i++) {
//				System.out.print(i + " ");
//			}
//		}

//		위 문제와 모든 것이 동일하나 , 1 미만의 숫자가 입력됐다면
//		1이상의 숫자를 입력해주세요 가 출력되면서 다시 사용자가 값을 입력하도록 하세요

//		int i = 1;
//		while (true) {
//			System.out.println("1이상의 숫자를 입력하세요.");
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

//		사용자로부터한 개의 값을 입력 받아 1 부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요
//		단, 입력한 수는 1 보다 크거나 같아야 합니다. 1 미만의 숫자가 입력됐다면
//		1이상의 숫자를 입력해주세요 가 출력되면서 다시 사용자가 값을 입력하도록 하세요

//		while (true) {
//			System.out.print("1이상의 숫자를 입력하세요 :");
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

//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요

//		int sum = 0;		
//		
//			System.out.print("정수를 하나 입력하세요 :");
//			int num = Integer.parseInt(sc.nextLine());
//			for (int i = 1; i <= num-1; i++) {
//				sum += i;
//				System.out.print(i + " + ");
//			}
//			System.out.print(num + " = " + (sum + num));

//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요
//		만일 1 미만의 숫자가 입력됐다면 1 이상의 숫자를 입력해주세요 를 출력하세요

//		while (true) {
//			System.out.println();
//			System.out.println("첫번째 정수를 입력하세요 :");
//			int num1 = Integer.parseInt(sc.nextLine());
//			System.out.println("두번째 정수를 입력하세요 :");
//			int num2 = Integer.parseInt(sc.nextLine());
//
//			if (num1 == 0 || num2 == 0) {
//				System.out.println("1이상의 숫자를 입력해주세요.");
//				continue;
//			} else if (num2 >= num1) {
//				System.out.println("첫 번째 숫자 : " + num1);
//				System.out.println("두 번째 숫자 : " + num2);
//				while (num1 <= num2) {
//					System.out.print(num1 + " ");
//					num1 += 1;
//				}
//			} else {
//				System.out.println("첫 번째 숫자 : " + num1);
//				System.out.println("두 번째 숫자 : " + num2);
//				while (num2 <= num1) {
//					System.out.print(num2 + " ");
//					num2 += 1;
//				}
//			}
//		}
//		사용자로부터 입력 받은 숫자의 단을 출력하세요
//		사용자로부터 입력 받은 숫자의 단부터 9 단까지 출력하세요
//		단 9 를 초과하는 숫자가 들어오면 9 이하의 숫자만 입력해주세요 를 출력하세요
//		위 문제와 모든 것이 동일하나 , 9 를 초과하는 숫자가 입력됐다면
//		9 이하의 숫자를 입력해주세요 가 출력되면서 다시 사용자가 값을 입력하도록 하세요
//		
//		int mul = 0;
//		while (true) {
//			System.out.println("숫자를 입력하세요");
//			int num = Integer.parseInt(sc.nextLine());
//
//			if (num > 9) {
//				System.out.println("9 이하의 숫자만 입력해주세요");
//				continue;
//			} else {
//				for(int j = num ; j <= 9 ; j++){
//					System.out.println("===== " + j + "단 =====");
//				}
//				for(int i = 1; i <= 9; i++) {
//					mul = num * i;
//					System.out.print(num + " * " + i + " = ");
//					System.out.println(mul);
//				}
//			}
//
//		}
//		사용자로부터 시작 숫자와 공차를 입력 받아
//		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요
//		단 출력되는 숫자는 총 10 개입니다

//		System.out.println("숫자를 입력하세요");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.println("공차를 입력하세요");
//		int num2 = Integer.parseInt(sc.nextLine());
//
//		for (int i = 1; i < 10; i++) {
//			num1 += num2;
//			System.out.print(num1 + " ");
//		}

//		정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요
//		단, 해당 프로그램은 연산자 입력에 exit 라는 값이 들어올 때까지 무한 반복하며
//		exit가 들어오면 프로그램을 종료합니다 를 출력하고 종료합니다
//		또한 연산자가 나누기이면서 두 번째 정수가 0 으로 들어오면
//		“0으로 나눌 수 없습니다 . 다시 입력해주세요 를 출력하며 없는
//		연산자가 들어올 시 없는 연산자입니다 . 다시 입력해주세요 라고 출력하고
//		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
//		boolean power = true;
//		while (power) {
//
//			System.out.println("연산자를 입력하세요");
//			String opr = sc.nextLine();
//			if (opr.equals("exit")) {
//				System.out.println("프로그램을 종료합니다.");
//				power = false;
//			} else {
//				System.out.println("정수1을 입력하세요");
//				int num1 = Integer.parseInt(sc.nextLine());
//				System.out.println("정수2를 입력하세요");
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
//						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
//						break;
//					} else {
//						System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//						break;
//					}
//				case "%":
//					System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
//					break;
//				default:
//					System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
//					break;
//
//				}
//
//			}
//		}

//		다음과 같은 실행 예제를 구현하세요
//		ex.
//		정수 입력 : 4
//		*
//		**
//		***
//		****

//		System.out.println("정수를 입력하세요");
//		int num = Integer.parseInt(sc.nextLine());
//		
//		for(int i = 1 ; i <= num ; i++) {
//			for(int j = 1 ; j <= i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		다음과 같은 실행 예제를 구현하세요
//		ex.
//		정수입력 : 4
//		****
//		***
//		**
//		*
//		System.out.println("정수를 입력하세요");
//		int num = Integer.parseInt(sc.nextLine());
//		
//		for(int i = 0 ; i < num ; i++) {
//			for(int j = 0 ; j < num-i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		컴퓨터와 가위바위보 게임하기.

//		int min = 1;
//		int max = 3;
//		int ran = (int) (Math.random() * (max - min + 1)) + min;
//		String rs = "";
//		System.out.println(ran);
//		switch (ran) {
//		case 1:
//			rs = "가위";
//			break;
//		case 2:
//			rs = "바위";
//			break;
//		case 3:
//			rs = "보";
//			break;
//		}
//
//		System.out.println("==== 가위 바위 보 게임 ====");
//		System.out.println("아래의 숫자 중 하나를 선택하세요.");
//		System.out.println("1.가위 2.바위 3.보");
//
//		int user = Integer.parseInt(sc.nextLine());
//
//		if (user == 1) {
//			System.out.println("컴퓨터: " + rs + " 사용자: 가위");
//			switch (ran) {
//			case 1:
//				System.out.println("비겼습니다.");
//				break;
//			case 2:
//				System.out.println("졌습니다.");
//				break;
//			case 3:
//				System.out.println("이겼습니다.");
//				break;
//			}
//		} else if (user == 2) {
//			System.out.println("컴퓨터: " + rs + " 사용자: 바위");
//			switch (ran) {
//			case 1:
//				System.out.println("이겼습니다.");
//				break;
//			case 2:
//				System.out.println("비겼습니다.");
//				break;
//			case 3:
//				System.out.println("졌습니다.");
//				break;
//			}
//		} else if (user == 3) {
//			System.out.println("컴퓨터: " + rs + " 사용자: 보");
//			switch (ran) {
//			case 1:
//				System.out.println("졌습니다.");
//				break;
//			case 2:
//				System.out.println("이겼습니다.");
//				break;
//			case 3:
//				System.out.println("비겼습니다.");
//				break;
//			}
//		}

	}
}