
public class Exam04_Overloading {

	public static int plus(int num1, int num2) {
		return num1 + num2;
	}

	public static int plus(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

//	public static double plus(double num1 , double num2) { // �Ű������� ������Ÿ�԰� 
//		                                                   // ���ϰ��� ������Ÿ���� �Ѵ� �ٸ��� �����ε��� �ƴϴ�.
//		return num1 + num2
//	}
	public static int plus(double num1, double num2) {
		return (int) (num1 + num2); // ���ϰ��� ������Ÿ���� ���� ����ȯ�ϴ� ����� �ִ�.
	}

	public static void main(String[] args) {

		// �޼����� �����ε�(Overloading)
		// ���� �޼����� �̸��� �Ű������� ������Ÿ���̳� ������ �ٸ��� �����ε� �����ϴ�.

		plus(5, 10);

		plus(5, 15, 20);

		plus(3.14, 3.2);

	}
}
