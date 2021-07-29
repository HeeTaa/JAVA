import java.util.Scanner;

public class homeWork_06 {
	public static int sum(int x, int y) {
		return x + y;
	}

	public static int sub(int x, int y) {
		return x - y;
	}

	public static int mul(int x, int y) {
		return x * y;
	}

	public static int div(int x, int y) {
		return x / y;
	}

	public static int remain(int x, int y) {
		return x % y;
	}

	public static void sayHi(int x) {

		for (int i = 0; i < x; i++) {
			System.out.println("안녕하세요!");
		}
	}

	public static String dict(String x) {
		if (x.equals("사과")) {
			return "apple";
		} else if (x.equals("배")) {
			return "pear";
		} else if (x.equals("포도")) {
			return "grape";
		} else if (x.equals("딸기")) {
			return "strawberry";
		} else if (x.equals("복숭아")) {
			return "peach";
		} else {
			return "다시입력하세요";
		}
	}

	public static int smaller(int x, int y) {
		if (x < y) {
			return x;
		} else if (y < x) {
			return y;
		} else {
			return 0;
		}
	}

	public static int countA(String x) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == 'A') {
				count++;
			}
		}
		return count;
	}

	public static int countChar(String x, char y) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == y) {
				count++;
			}
		}
		return count;
	}

	public static int findJava(String x) {

		String[] spl = x.split(":");
		int count = 0;

		for (int i = 0; i < spl.length; i++) {
			if (spl[i].equals("Java")) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

//1.	기존에 만들어 놨던 사칙연산 계산기 코드에서 각 연산(+, -, *, /)을 메서드로 만들어 분리하여 코드를 수정해 보세요.
//( main 안에서는 연산이 직접 이뤄지는게 아니라 결과값만 출력할 수 있도록!)
//			
//Scanner sc = new Scanner(System.in);
//boolean power = true;
//while (power) {
//
//	System.out.println("연산자를 입력하세요");
//	String opr = sc.nextLine();
//	if (opr.equals("exit")) {
//		System.out.println("프로그램을 종료합니다.");
//		power = false;
//	} else {
//		System.out.println("정수1을 입력하세요");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.println("정수2를 입력하세요");
//		int num2 = Integer.parseInt(sc.nextLine());
//
//		switch (opr) {
//		case "+":
//			System.out.println(num1 + " + " + num2 + " = " + sum(num1,num2));
//			break;
//		case "-":
//			System.out.println(num1 + " - " + num2 + " = " + sub(num1,num2));
//			break;
//		case "*":
//			System.out.println(num1 + " * " + num2 + " = " + mul(num1,num2));
//			break;
//		case "/":
//			if (num1 == 0 || num2 == 0) {
//				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
//				break;
//			} else {
//				System.out.println(num1 + " / " + num2 + " = " + div(num1,num2));
//				break;
//			}
//		case "%":
//			System.out.println(num1 + " % " + num2 + " = " + remain(num1,num2));
//			break;
//		default:
//			System.out.println("없는 연산자 입니다. 다시 입력해주세요.");
//			break;
//
//		}
//
//	}
//}
//		2.	사용자가 정수를 입력하면 입력한 정수만큼 “안녕하세요!” 를 출력하는 메서드를 만들고 사용해 보세요. 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("안녕하세요!를 표기 할 만큼 정수를 입력하세요.");
//		int input = Integer.parseInt(sc.nextLine());
//		
//		sayHi(input);

//		3.	한글 단어를 입력하면 영어로 출력해주는 메서드를 만들고 사용해 보세요 (5개 단어만 만들어 보세요~)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("사과, 배, 포도, 딸기, 복숭아 중에 고르시오");
//		System.out.print(">> ");
//		String result1 = dict(sc.nextLine());
//		System.out.println(result1);

//		4.	두 수를 인자로 받아 더 작은 수를 반환하는 메서드 smaller 를 만드시오.
//		  조건. 두 수가 같을 경우에는 0을 반환.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하세요");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 정수를 입력하세요");
//		int num2 = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(smaller(num1,num2));

//		5.String형 변수를 만들어 임의의 값을 넣고 아래의 메서드들을 직접 사용해보고 어떤 메서드인지 주석으로 작성해 보세요.
//		-	indexOf() // 인덱스번호를 찾고싶은 String형이나 int형을 인수로 넣으면 메소드에서 매개변수를 String배열에 넣은후 해당 인수가 포함된 인덱스번호를 int형으로 반환해준다.
//		-	toCharArray() // String형을 문자 각각의 char형으로 나누어준다.
//		-	split() // 특수문자를 인수로 받아 특수문자 기준으로 문자열을 나눠주고 String값으로 반환해준다
//		-	replace() // 인수 1에는 기존문자 인수2에는 대체할문자 를 받아서 기존문자를 대체할문자로 바꿔준후 String형으로 반환해준다.

//		6.아래 만들어진 스트링형 변수의 값에서 A를 찾아 카운트(A의 총 개수)하는 메서드, 
//		  인자로 넘어온 알파벳을 찾아 카운트하는 메서드 두 개를 직접 만들어 보세요.
//		  String str = 
//		  "ASLKVLNCLSAOLIVHOSDIHOFWEIJNFLAKSJFLSDKIHFOWEIFLAKSDHOKFAUJSGFIKQEJFA";
//		  
//		  int result1 = countA(str);
//		  // 저 문자열 안에서 A의 개수를 찾아서 반환하는 함수.
//		  int result2 = countChar(str,'B'); 
//		  // 인자로 넘어오는 캐릭터 값이 총 몇개인지 찾아서 반환하는 함수.
//		  
//		  	System.out.println("A의 개수: " + result1);
//			System.out.println("B의 개수: " + result2);
		
//	   7. 아래의 스트링 변수의 데이터에서 Java가 몇 개인지 찾아서 카운트 해주는 메서드를 만들어 보세요.	
//	   String str = 
//	   "Ivaj:Jiva:Ivaj:Jalv:Iava:Ivaj:Jvaa:Jeva:Ivaj:Jeva:Jiva:Ivaj:Jiva:Iava:Ivaj:Jalv:Jvaa:Jalv:Java:Jiva:Iava:Jiva:Jova:Ivaj:Jiva:Ivaj:Jeva:Jvaa:Java:Jalv:Iava:Jiva:Ivaj:Java:Jvaa:Jalv:Java:Jova:Ivaj:Jova:Iava:Java:Jvaa:Jiva:Jeva:Jova:Jvaa:Jiva:Jvaa:Jeva:Jiva:Iava:Java:Java:Jvaa:Iava:Jova:Jeva:Ivaj:Jova:Iava:Jvaa:Jiva:Jalv:Java:Jvaa:Jiva:Jvaa:Jvaa:Ivaj:Jova:Jeva:Jalv:Java:Jalv:Ivaj:Ivaj:Java:Iava:Ivaj:Jeva:Ivaj:Jiva:Java:Iava:Java:Jiva:Jvaa:Jova:Java:Jiva:Jeva:Java:Ivaj:Jeva:Java:Jova:Ivaj:Ivaj:Jvaa:Iava:Jvaa:Jiva:Jeva:Iava:Jvaa:Jova:Jova:Jeva:Jeva:Jeva:Jalv:Ivaj:Jiva:Iava:Jova:Jova:Jeva:Jova:Jova:Java:Java:Jova:Ivaj:Jvaa:Jalv:Jalv:Jova:Java:Jeva:Ivaj:Jalv:Iava:Jiva:Java:Iava:Jiva:Java:Iava:Jalv:Jvaa:Iava:Jiva:Jalv:Jvaa:Jova:Jalv:Ivaj:Jeva:Jova:Jalv:Java:Ivaj:Jeva:Java:Jeva:Jova:Java:Jiva:Jova:Jvaa:Ivaj:Jalv:Jova:Jvaa:Jova:Jeva:Jeva:Jiva:Iava:Ivaj:Iava:Java:Java:Ivaj:Jiva:Java:Jeva:Jova:Jiva:Jalv:Jiva:Ivaj:Jova:Iava:Jiva:Jalv:Jiva:Java:Jova:Jalv:Iava:Jvaa:Jiva:Jvaa:Java:Ivaj:Jeva:Iava:Jvaa:Java:Jeva:Jeva:Ivaj:Jvaa:Java:Jvaa:Iava:Java:Jeva:Iava:Ivaj:Jiva:Jalv:Jvaa:Java:Jvaa:Jeva:Jalv:Jova:Jiva:Java:Java:Jiva:Jvaa:Iava:Jalv:Jiva:Jvaa:Jiva:Java:Jova:Java:Jeva:Jova:Jvaa:Jeva:Iava:Jeva:Jalv:Ivaj:Ivaj:Jova:Jvaa:Jova:Ivaj:Jova:Jova:Jova:Jeva:Ivaj:Java:Ivaj:Java:Jvaa:Jvaa:Jvaa:Jiva:Iava:Jova:Ivaj:Iava:Ivaj:Jiva:Jvaa:Jvaa:Java:Java:Jvaa:Iava:Iava:Jiva:Jalv:Jvaa:Java:Java:Java:Ivaj:Jeva:Jiva:Jova:Iava:Iava:Java:Java:Jova:Ivaj:Jalv:Jova:Jvaa:Jeva:Ivaj:Jiva:Jvaa:Jiva:Ivaj:Jiva:Iava:Iava:Jeva:Ivaj:Ivaj:Jiva:Ivaj:Jalv:Java:Jalv:Jova:Java:Ivaj:Ivaj:Ivaj:Jova:Jova:Iava:Java:Java:Jalv:Jalv:Jalv:Ivaj:Jvaa:Jalv:Jiva:Jiva:Java:Jalv:Ivaj:Iava:Ivaj:Ivaj:Jeva:Jiva:Jalv:Jvaa:Jeva:Jalv:Jvaa:Iava:Ivaj:Jiva:Jvaa:Jova:Jova:Ivaj:Iava:Ivaj:Jova:Jvaa:Iava:Iava:Ivaj:Iava:Jvaa:Jiva:Jeva:Java:Iava:Java:Jvaa:Jova:Jova:Ivaj:Jova:Iava:Ivaj:Jiva:Jiva:Jvaa:Jova:Jalv:Jalv:Jvaa:Jalv:Jeva:Iava:Jvaa:Ivaj:Jova:Jvaa:Ivaj:Java:Jalv:Java:Jeva:Java:Jeva:Jvaa:Iava:Jalv:Jiva:Iava:Jvaa:Jalv:Jalv:Jalv:Jvaa:Ivaj:Iava:Jeva:Jalv:Jvaa:Jeva:Iava:Iava:Java:Jvaa:Jalv:Iava:Ivaj:Jvaa:Jova:Jvaa:Jiva:Jova:Jalv:Jova:Jova:Java:Jeva:Jalv:Iava:Jiva:Jeva:Jeva:Java:Jiva:Jova:Jiva:Ivaj:Jova:Java:Jiva:Jalv:Ivaj:Jiva:Ivaj:Jeva:Jalv:Ivaj:Ivaj:Ivaj:Jvaa:Jalv:Ivaj:Jvaa:Jova:Iava:Ivaj:Jeva:Jalv:Jvaa:Iava:Jalv:Jeva:Jeva:Jvaa:Java:Jeva:Ivaj:Iava:Jiva:Ivaj:Java:Ivaj:Iava:Jeva:Jova:Jalv:Jiva:Jova:Jiva:Jalv:Jova:Jeva:Jiva:Ivaj:Jova:Java:Iava:Iava:Jiva:Ivaj:Jova:Iava:Jiva:Jova:Iava:Jalv:Jeva:Ivaj:Jova:Iava:Iava:Ivaj:Jvaa:Ivaj:Jalv:Jalv:Iava:Jalv:Jiva:Jalv:Ivaj:Jalv:Jova:Iava:Jova:Jova:Ivaj:Jvaa:Ivaj:Jeva:Jalv:Jeva:Jvaa:Jiva:Jalv:Jalv:Jvaa:Iava:Jvaa:Java:Ivaj:Jova:Iava:Jeva:Jeva:Ivaj:Jvaa:Iava:Iava:Ivaj:Jova:Jova:Jova:Jiva:Jeva:Ivaj:Jvaa:Ivaj:Iava:Jova:Iava:Jeva:Java:Jalv:Jvaa:Jiva:Jiva:Jeva:Java:Jeva:Java:Jova:Jova:Ivaj:Jiva:Iava:Jiva:Ivaj:Ivaj:Iava:Jeva:Jalv:Iava:Jova:Jalv:Jeva:Ivaj:Ivaj:Ivaj:Iava:Jalv:Iava:Ivaj:Jova:Ivaj:Java:Jeva:Jvaa:Jiva:Java:Jvaa:Jova:Jvaa:Jova:Jalv:Iava:Jvaa:Jeva:Java:Iava:Jiva:Java:Java:Java:Iava:Ivaj:Jova:Jeva:Jalv:Jova:Jvaa:Jvaa:Jeva:Ivaj:Iava:Iava:Java:Jvaa:Ivaj:Ivaj:Jeva:Jeva:Ivaj:Ivaj:Iava:Jeva:Java:Jova:Jvaa:Iava:Jvaa:Iava:Jvaa:Ivaj:Jova:Jalv:Jova:Java:Jeva:Jova:Iava:Jalv:Java:Jiva:Jalv:Iava:Iava:Iava:Jvaa:Jova:Jiva:Jiva:Jeva:Jeva:Jvaa:Jiva:Jova:Ivaj:Iava:Iava:Ivaj:Jiva:Ivaj:Ivaj:Jova:Jalv:Jeva:Java:Iava:Jalv:Jiva:Iava:Jeva:Jeva:Jiva:Jiva:Ivaj:Jalv:Jova:Jalv:Java:Java:Jalv:Jalv:Iava:Jova:Java:Jeva:Java:Jiva:Jvaa:Java:Iava:Jova:Ivaj:Jeva:Jalv:Jalv:Jvaa:Iava:Iava:Jova:Jvaa:Java:Jvaa:Jvaa:Jiva:Ivaj:Jvaa:Jvaa:Jova:Java:Jeva:Ivaj:Ivaj:Jalv:Java:Java:Jiva:Ivaj:Jalv:Java:Java:Jvaa:Jiva:Jeva:Jvaa:Java:Jova:Jvaa:Ivaj:Jalv:Java:Jiva:Jvaa:Jova:Java:Jeva:Jalv:Jalv:Ivaj:Java:Java:Iava:Jvaa:Iava:Java:Jeva:Jalv:Java:Jova:Java:Jvaa:Java:Jalv:Ivaj:Iava:Jova:Ivaj:Jalv:Ivaj:Jova:Ivaj:Java:Jvaa:Jvaa:Jova:Jvaa:Jalv:Jiva:Iava:Jalv:Java:Jalv:Java:Java:Java:Jeva:Jova:Jeva:Java:Ivaj:Jalv:Jova:Jeva:Jiva:Jvaa:Jova:Jiva:Iava:Jalv:Java:Jova:Jvaa:Jeva:Jiva:Jiva:Ivaj:Jeva:Jeva:Jeva:Java:Jalv:Jiva:Jalv:Jiva:Iava:Jeva:Java:Jeva:Ivaj:Ivaj:Jalv:Jeva:Jeva:Iava:Jvaa:Jiva:Jvaa:Jalv:Jvaa:Jiva:Jvaa:Java:Jova:Ivaj:Jeva:Java:Java:Jiva:Java:Ivaj:Jeva:Jvaa:Iava:Jiva:Iava:Jova:Jova:Jiva:Iava:Jova:Jova:Jova:Ivaj:Ivaj:Jvaa:Jalv:Iava:Jeva:Jvaa:Jiva:Java:Java:Jvaa:Jalv:Java:Iava:Iava:Jeva:Jalv:Jvaa:Java:Ivaj:Jiva:Jvaa:Iava:Jiva:Jova:Jalv:Jalv:Jova:Jova:Iava:Java:Jiva:Iava:Java:Jeva:Java:Jeva:Ivaj:Ivaj:Java:Jvaa:Jiva:Java:Jeva:Ivaj:Jova:Iava:Ivaj:Jalv:Java:Jova:Jvaa:Iava:Jova:Jova:Jalv:Java:Jeva:Jova:Jeva:Ivaj:Jeva:Jalv:Jeva:Jova:Java:Ivaj:Jiva:Ivaj:Java:Jalv:Jeva:Jeva:Jova:Jeva:Ivaj:Jvaa:Jvaa:Jova:Jalv:Jvaa:Jvaa:Java:Ivaj:Jalv:Java:Ivaj:Jiva:Iava:Jeva:Jova:Ivaj:Jeva:Jiva:Ivaj:Jalv:Jalv:Ivaj:Jova:Jvaa:Jeva:Java:Jiva:Jvaa:Jvaa:Java:Ivaj:Jalv:Jvaa:Jeva:Java:Java:Jeva:Java:Java:Java:Jeva:Java:Jiva:Jiva:Java:Jeva:Jalv:Ivaj:Iava:Java:Jalv:Java:Jiva:Iava:Jiva:Jiva:Jalv:Jalv:Jiva:Jalv:Jova:Jalv:Jiva:Jova:Jiva:Ivaj:Jalv:Java:Jiva:Ivaj:Ivaj:Jvaa:Jiva:Ivaj:Jova:Jvaa:Jeva:Java:Ivaj:Ivaj:Jeva:Jvaa:Jvaa:Jova:Jiva:Jeva:Ivaj";
//	   int result = findJava(str); // 위 문자열 안에서 Java가 몇개인지 찾는 문제.
//	   System.out.println("Java의 개수 : " + result);
	

	}
}
