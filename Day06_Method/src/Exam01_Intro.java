
public class Exam01_Intro {

	              // ����(��ȯ)������ Ÿ��
	public static int plus(int num1, int num2) { // �Ű����� & parameter

		return num1 + num2; // return���� �ǵ����ش�.
	} // �޼��� ���Ǻ�

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static int divide(int x, int y) {
		return x / y;
	}
	
	
		public static void main(String[] args) {
//			�޼���(Method)
//			�޼����, Ư�� �۾��� �����ϱ� ���� ��ɹ��� ����
//			��/���� ����� ������ �ϰ� �ɋ� ����� �и��� ��������.
//			�������� ��������.
//			���� �����̳� ���������� �����ϴ�.
			
//			10 + 5 �޼��� ������
//			System.out.println(10 + 5);   
			
			plus(10, 5); // ���ڰ� & argument  //�޼��� ȣ���
			System.out.println("plus(10,5) : "  + plus(10,5));
			int rs = plus(10, 5); // �޼��带 ������ ������ �ִ�.
			System.out.println("rs : " + rs);
			
			minus(10,5);
			System.out.println("minus(10,5) : " + minus(10,5));
			
			multiply(10,5);
			System.out.println("multiply(10,5) : " + multiply(10,5));
			
			divide(10,5);
			System.out.println("divide(10,5) : " + divide(10,5));
		
			
			
		}
}
