
public class Exam05_Swap {
	public static void main(String[] args) {
		// swap : arr�̶�� �迭�� 'A' 'B' ��� ���� �ִٶ�� ���� �� �� �ΰ��� ������ �ٲ��ִ� ��

//		char[] arr = new char[]	{'A', 'B'};
//		char tmp;
//		tmp = arr[0];
//		arr[0] = arr[1];
//		arr[1] = tmp;
//		System.out.println(arr[0] + " " + arr[1]);

		// hello��� ĳ�������� ��� �迭�� �������

		char[] arr = new char[] { 'h', 'e', 'l', 'l', 'o' };
		int length = arr.length;
		char temp = 0;

		for (int i = 0; i < length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[length - i - 1];
			arr[length - 1 - i] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
