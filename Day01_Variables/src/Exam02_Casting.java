
public class Exam02_Casting {
	public static void main(String[] args) {
		/*
		 * ����ȯ(Casting) 1.�ڵ�����ȯ(promotion)����������Ÿ���� ū������Ÿ�Կ� �������ִ�
		 */
		byte b1 = 123;
		short s1 = b1;
		int i1 = b1;
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		/*
		 * 2.��������ȯ(down casting) ū������Ÿ���� ����������Ÿ�Կ� ������������ (Ÿ��)�� �־ ������ �ٲܼ��ִ�. �Ǽ����� ���
		 * ���������� ũ�� �Ǽ����� ������ ���������� �ٲٸ� �Ҽ����� �������
		 */
		int i2 = 200;
		byte b3;
		b3 = (byte) i2;
		System.out.println(b3);

	}
}
