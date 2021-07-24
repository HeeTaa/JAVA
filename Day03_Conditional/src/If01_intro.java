import java.util.Scanner;

public class If01_intro {
	public static void main(String[] args) {
		// if -> 조건문이 참일때 if문 안의 코드가 실행되고 , 거짓이라면 건너 뜀.
/*
		Scanner sc = new Scanner(System.in);

		System.out.println("입력값 >>");
		int num = Integer.parseInt(sc.nextLine());

		if (num == 1) {
			System.out.println("입력한 값은 1입니다.");
		} else if (num == 2) {
			System.out.println("입력한 값은 2입니다.");
		} else {
			System.out.println("입력한 값은 1이나2가 아닙니다.");
		}
*/
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을입력하세요");
		String str = sc.nextLine();
		System.out.println("숫자를입력하세요");
		int num = Integer.parseInt(sc.nextLine());
		
		if(str.equals("이름")) {             //if안에 if 즉 중첩if문은 && 와 비슷하게 동작한다. ex) str.equals("이름") ==
			if(num == 1) {
				System.out.println("김희태입니다.");
			}
			
		}
	}

}
