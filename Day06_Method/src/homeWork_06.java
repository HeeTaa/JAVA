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
			System.out.println("�ȳ��ϼ���!");
		}
	}

	public static String dict(String x) {
		if (x.equals("���")) {
			return "apple";
		} else if (x.equals("��")) {
			return "pear";
		} else if (x.equals("����")) {
			return "grape";
		} else if (x.equals("����")) {
			return "strawberry";
		} else if (x.equals("������")) {
			return "peach";
		} else {
			return "�ٽ��Է��ϼ���";
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

//1.	������ ����� ���� ��Ģ���� ���� �ڵ忡�� �� ����(+, -, *, /)�� �޼���� ����� �и��Ͽ� �ڵ带 ������ ������.
//( main �ȿ����� ������ ���� �̷����°� �ƴ϶� ������� ����� �� �ֵ���!)
//			
//Scanner sc = new Scanner(System.in);
//boolean power = true;
//while (power) {
//
//	System.out.println("�����ڸ� �Է��ϼ���");
//	String opr = sc.nextLine();
//	if (opr.equals("exit")) {
//		System.out.println("���α׷��� �����մϴ�.");
//		power = false;
//	} else {
//		System.out.println("����1�� �Է��ϼ���");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.println("����2�� �Է��ϼ���");
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
//				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
//				break;
//			} else {
//				System.out.println(num1 + " / " + num2 + " = " + div(num1,num2));
//				break;
//			}
//		case "%":
//			System.out.println(num1 + " % " + num2 + " = " + remain(num1,num2));
//			break;
//		default:
//			System.out.println("���� ������ �Դϴ�. �ٽ� �Է����ּ���.");
//			break;
//
//		}
//
//	}
//}
//		2.	����ڰ� ������ �Է��ϸ� �Է��� ������ŭ ���ȳ��ϼ���!�� �� ����ϴ� �޼��带 ����� ����� ������. 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�ȳ��ϼ���!�� ǥ�� �� ��ŭ ������ �Է��ϼ���.");
//		int input = Integer.parseInt(sc.nextLine());
//		
//		sayHi(input);

//		3.	�ѱ� �ܾ �Է��ϸ� ����� ������ִ� �޼��带 ����� ����� ������ (5�� �ܾ ����� ������~)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���, ��, ����, ����, ������ �߿� ���ÿ�");
//		System.out.print(">> ");
//		String result1 = dict(sc.nextLine());
//		System.out.println(result1);

//		4.	�� ���� ���ڷ� �޾� �� ���� ���� ��ȯ�ϴ� �޼��� smaller �� ����ÿ�.
//		  ����. �� ���� ���� ��쿡�� 0�� ��ȯ.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ù��° ������ �Է��ϼ���");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.println("�ι�° ������ �Է��ϼ���");
//		int num2 = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(smaller(num1,num2));

//		5.String�� ������ ����� ������ ���� �ְ� �Ʒ��� �޼������ ���� ����غ��� � �޼������� �ּ����� �ۼ��� ������.
//		-	indexOf() // �ε�����ȣ�� ã����� String���̳� int���� �μ��� ������ �޼ҵ忡�� �Ű������� String�迭�� ������ �ش� �μ��� ���Ե� �ε�����ȣ�� int������ ��ȯ���ش�.
//		-	toCharArray() // String���� ���� ������ char������ �������ش�.
//		-	split() // Ư�����ڸ� �μ��� �޾� Ư������ �������� ���ڿ��� �����ְ� String������ ��ȯ���ش�
//		-	replace() // �μ� 1���� �������� �μ�2���� ��ü�ҹ��� �� �޾Ƽ� �������ڸ� ��ü�ҹ��ڷ� �ٲ����� String������ ��ȯ���ش�.

//		6.�Ʒ� ������� ��Ʈ���� ������ ������ A�� ã�� ī��Ʈ(A�� �� ����)�ϴ� �޼���, 
//		  ���ڷ� �Ѿ�� ���ĺ��� ã�� ī��Ʈ�ϴ� �޼��� �� ���� ���� ����� ������.
//		  String str = 
//		  "ASLKVLNCLSAOLIVHOSDIHOFWEIJNFLAKSJFLSDKIHFOWEIFLAKSDHOKFAUJSGFIKQEJFA";
//		  
//		  int result1 = countA(str);
//		  // �� ���ڿ� �ȿ��� A�� ������ ã�Ƽ� ��ȯ�ϴ� �Լ�.
//		  int result2 = countChar(str,'B'); 
//		  // ���ڷ� �Ѿ���� ĳ���� ���� �� ����� ã�Ƽ� ��ȯ�ϴ� �Լ�.
//		  
//		  	System.out.println("A�� ����: " + result1);
//			System.out.println("B�� ����: " + result2);
		
//	   7. �Ʒ��� ��Ʈ�� ������ �����Ϳ��� Java�� �� ������ ã�Ƽ� ī��Ʈ ���ִ� �޼��带 ����� ������.	
//	   String str = 
//	   "Ivaj:Jiva:Ivaj:Jalv:Iava:Ivaj:Jvaa:Jeva:Ivaj:Jeva:Jiva:Ivaj:Jiva:Iava:Ivaj:Jalv:Jvaa:Jalv:Java:Jiva:Iava:Jiva:Jova:Ivaj:Jiva:Ivaj:Jeva:Jvaa:Java:Jalv:Iava:Jiva:Ivaj:Java:Jvaa:Jalv:Java:Jova:Ivaj:Jova:Iava:Java:Jvaa:Jiva:Jeva:Jova:Jvaa:Jiva:Jvaa:Jeva:Jiva:Iava:Java:Java:Jvaa:Iava:Jova:Jeva:Ivaj:Jova:Iava:Jvaa:Jiva:Jalv:Java:Jvaa:Jiva:Jvaa:Jvaa:Ivaj:Jova:Jeva:Jalv:Java:Jalv:Ivaj:Ivaj:Java:Iava:Ivaj:Jeva:Ivaj:Jiva:Java:Iava:Java:Jiva:Jvaa:Jova:Java:Jiva:Jeva:Java:Ivaj:Jeva:Java:Jova:Ivaj:Ivaj:Jvaa:Iava:Jvaa:Jiva:Jeva:Iava:Jvaa:Jova:Jova:Jeva:Jeva:Jeva:Jalv:Ivaj:Jiva:Iava:Jova:Jova:Jeva:Jova:Jova:Java:Java:Jova:Ivaj:Jvaa:Jalv:Jalv:Jova:Java:Jeva:Ivaj:Jalv:Iava:Jiva:Java:Iava:Jiva:Java:Iava:Jalv:Jvaa:Iava:Jiva:Jalv:Jvaa:Jova:Jalv:Ivaj:Jeva:Jova:Jalv:Java:Ivaj:Jeva:Java:Jeva:Jova:Java:Jiva:Jova:Jvaa:Ivaj:Jalv:Jova:Jvaa:Jova:Jeva:Jeva:Jiva:Iava:Ivaj:Iava:Java:Java:Ivaj:Jiva:Java:Jeva:Jova:Jiva:Jalv:Jiva:Ivaj:Jova:Iava:Jiva:Jalv:Jiva:Java:Jova:Jalv:Iava:Jvaa:Jiva:Jvaa:Java:Ivaj:Jeva:Iava:Jvaa:Java:Jeva:Jeva:Ivaj:Jvaa:Java:Jvaa:Iava:Java:Jeva:Iava:Ivaj:Jiva:Jalv:Jvaa:Java:Jvaa:Jeva:Jalv:Jova:Jiva:Java:Java:Jiva:Jvaa:Iava:Jalv:Jiva:Jvaa:Jiva:Java:Jova:Java:Jeva:Jova:Jvaa:Jeva:Iava:Jeva:Jalv:Ivaj:Ivaj:Jova:Jvaa:Jova:Ivaj:Jova:Jova:Jova:Jeva:Ivaj:Java:Ivaj:Java:Jvaa:Jvaa:Jvaa:Jiva:Iava:Jova:Ivaj:Iava:Ivaj:Jiva:Jvaa:Jvaa:Java:Java:Jvaa:Iava:Iava:Jiva:Jalv:Jvaa:Java:Java:Java:Ivaj:Jeva:Jiva:Jova:Iava:Iava:Java:Java:Jova:Ivaj:Jalv:Jova:Jvaa:Jeva:Ivaj:Jiva:Jvaa:Jiva:Ivaj:Jiva:Iava:Iava:Jeva:Ivaj:Ivaj:Jiva:Ivaj:Jalv:Java:Jalv:Jova:Java:Ivaj:Ivaj:Ivaj:Jova:Jova:Iava:Java:Java:Jalv:Jalv:Jalv:Ivaj:Jvaa:Jalv:Jiva:Jiva:Java:Jalv:Ivaj:Iava:Ivaj:Ivaj:Jeva:Jiva:Jalv:Jvaa:Jeva:Jalv:Jvaa:Iava:Ivaj:Jiva:Jvaa:Jova:Jova:Ivaj:Iava:Ivaj:Jova:Jvaa:Iava:Iava:Ivaj:Iava:Jvaa:Jiva:Jeva:Java:Iava:Java:Jvaa:Jova:Jova:Ivaj:Jova:Iava:Ivaj:Jiva:Jiva:Jvaa:Jova:Jalv:Jalv:Jvaa:Jalv:Jeva:Iava:Jvaa:Ivaj:Jova:Jvaa:Ivaj:Java:Jalv:Java:Jeva:Java:Jeva:Jvaa:Iava:Jalv:Jiva:Iava:Jvaa:Jalv:Jalv:Jalv:Jvaa:Ivaj:Iava:Jeva:Jalv:Jvaa:Jeva:Iava:Iava:Java:Jvaa:Jalv:Iava:Ivaj:Jvaa:Jova:Jvaa:Jiva:Jova:Jalv:Jova:Jova:Java:Jeva:Jalv:Iava:Jiva:Jeva:Jeva:Java:Jiva:Jova:Jiva:Ivaj:Jova:Java:Jiva:Jalv:Ivaj:Jiva:Ivaj:Jeva:Jalv:Ivaj:Ivaj:Ivaj:Jvaa:Jalv:Ivaj:Jvaa:Jova:Iava:Ivaj:Jeva:Jalv:Jvaa:Iava:Jalv:Jeva:Jeva:Jvaa:Java:Jeva:Ivaj:Iava:Jiva:Ivaj:Java:Ivaj:Iava:Jeva:Jova:Jalv:Jiva:Jova:Jiva:Jalv:Jova:Jeva:Jiva:Ivaj:Jova:Java:Iava:Iava:Jiva:Ivaj:Jova:Iava:Jiva:Jova:Iava:Jalv:Jeva:Ivaj:Jova:Iava:Iava:Ivaj:Jvaa:Ivaj:Jalv:Jalv:Iava:Jalv:Jiva:Jalv:Ivaj:Jalv:Jova:Iava:Jova:Jova:Ivaj:Jvaa:Ivaj:Jeva:Jalv:Jeva:Jvaa:Jiva:Jalv:Jalv:Jvaa:Iava:Jvaa:Java:Ivaj:Jova:Iava:Jeva:Jeva:Ivaj:Jvaa:Iava:Iava:Ivaj:Jova:Jova:Jova:Jiva:Jeva:Ivaj:Jvaa:Ivaj:Iava:Jova:Iava:Jeva:Java:Jalv:Jvaa:Jiva:Jiva:Jeva:Java:Jeva:Java:Jova:Jova:Ivaj:Jiva:Iava:Jiva:Ivaj:Ivaj:Iava:Jeva:Jalv:Iava:Jova:Jalv:Jeva:Ivaj:Ivaj:Ivaj:Iava:Jalv:Iava:Ivaj:Jova:Ivaj:Java:Jeva:Jvaa:Jiva:Java:Jvaa:Jova:Jvaa:Jova:Jalv:Iava:Jvaa:Jeva:Java:Iava:Jiva:Java:Java:Java:Iava:Ivaj:Jova:Jeva:Jalv:Jova:Jvaa:Jvaa:Jeva:Ivaj:Iava:Iava:Java:Jvaa:Ivaj:Ivaj:Jeva:Jeva:Ivaj:Ivaj:Iava:Jeva:Java:Jova:Jvaa:Iava:Jvaa:Iava:Jvaa:Ivaj:Jova:Jalv:Jova:Java:Jeva:Jova:Iava:Jalv:Java:Jiva:Jalv:Iava:Iava:Iava:Jvaa:Jova:Jiva:Jiva:Jeva:Jeva:Jvaa:Jiva:Jova:Ivaj:Iava:Iava:Ivaj:Jiva:Ivaj:Ivaj:Jova:Jalv:Jeva:Java:Iava:Jalv:Jiva:Iava:Jeva:Jeva:Jiva:Jiva:Ivaj:Jalv:Jova:Jalv:Java:Java:Jalv:Jalv:Iava:Jova:Java:Jeva:Java:Jiva:Jvaa:Java:Iava:Jova:Ivaj:Jeva:Jalv:Jalv:Jvaa:Iava:Iava:Jova:Jvaa:Java:Jvaa:Jvaa:Jiva:Ivaj:Jvaa:Jvaa:Jova:Java:Jeva:Ivaj:Ivaj:Jalv:Java:Java:Jiva:Ivaj:Jalv:Java:Java:Jvaa:Jiva:Jeva:Jvaa:Java:Jova:Jvaa:Ivaj:Jalv:Java:Jiva:Jvaa:Jova:Java:Jeva:Jalv:Jalv:Ivaj:Java:Java:Iava:Jvaa:Iava:Java:Jeva:Jalv:Java:Jova:Java:Jvaa:Java:Jalv:Ivaj:Iava:Jova:Ivaj:Jalv:Ivaj:Jova:Ivaj:Java:Jvaa:Jvaa:Jova:Jvaa:Jalv:Jiva:Iava:Jalv:Java:Jalv:Java:Java:Java:Jeva:Jova:Jeva:Java:Ivaj:Jalv:Jova:Jeva:Jiva:Jvaa:Jova:Jiva:Iava:Jalv:Java:Jova:Jvaa:Jeva:Jiva:Jiva:Ivaj:Jeva:Jeva:Jeva:Java:Jalv:Jiva:Jalv:Jiva:Iava:Jeva:Java:Jeva:Ivaj:Ivaj:Jalv:Jeva:Jeva:Iava:Jvaa:Jiva:Jvaa:Jalv:Jvaa:Jiva:Jvaa:Java:Jova:Ivaj:Jeva:Java:Java:Jiva:Java:Ivaj:Jeva:Jvaa:Iava:Jiva:Iava:Jova:Jova:Jiva:Iava:Jova:Jova:Jova:Ivaj:Ivaj:Jvaa:Jalv:Iava:Jeva:Jvaa:Jiva:Java:Java:Jvaa:Jalv:Java:Iava:Iava:Jeva:Jalv:Jvaa:Java:Ivaj:Jiva:Jvaa:Iava:Jiva:Jova:Jalv:Jalv:Jova:Jova:Iava:Java:Jiva:Iava:Java:Jeva:Java:Jeva:Ivaj:Ivaj:Java:Jvaa:Jiva:Java:Jeva:Ivaj:Jova:Iava:Ivaj:Jalv:Java:Jova:Jvaa:Iava:Jova:Jova:Jalv:Java:Jeva:Jova:Jeva:Ivaj:Jeva:Jalv:Jeva:Jova:Java:Ivaj:Jiva:Ivaj:Java:Jalv:Jeva:Jeva:Jova:Jeva:Ivaj:Jvaa:Jvaa:Jova:Jalv:Jvaa:Jvaa:Java:Ivaj:Jalv:Java:Ivaj:Jiva:Iava:Jeva:Jova:Ivaj:Jeva:Jiva:Ivaj:Jalv:Jalv:Ivaj:Jova:Jvaa:Jeva:Java:Jiva:Jvaa:Jvaa:Java:Ivaj:Jalv:Jvaa:Jeva:Java:Java:Jeva:Java:Java:Java:Jeva:Java:Jiva:Jiva:Java:Jeva:Jalv:Ivaj:Iava:Java:Jalv:Java:Jiva:Iava:Jiva:Jiva:Jalv:Jalv:Jiva:Jalv:Jova:Jalv:Jiva:Jova:Jiva:Ivaj:Jalv:Java:Jiva:Ivaj:Ivaj:Jvaa:Jiva:Ivaj:Jova:Jvaa:Jeva:Java:Ivaj:Ivaj:Jeva:Jvaa:Jvaa:Jova:Jiva:Jeva:Ivaj";
//	   int result = findJava(str); // �� ���ڿ� �ȿ��� Java�� ����� ã�� ����.
//	   System.out.println("Java�� ���� : " + result);
	

	}
}
