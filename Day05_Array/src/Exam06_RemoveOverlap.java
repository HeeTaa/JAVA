
public class Exam06_RemoveOverlap {
	public static void main(String[] args) {
		// math.random()���� ������ ���� �̴µ� 1~100���� int�� �迭�� ���
		// �� �ȿ��� �����ϰ� ���� �̾Ƴ��ÿ�.

		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < 1000; i++) {
			// math.random() ���ϴ� ������ ���� �̾Ƴ� ��
			// (int)(Math.random() * (max - min + 1)) + min ;
			int temp;
			int x = (int) (Math.random() * 100);
			int y = (int) (Math.random() * 100);

			// �ӽ� ���� ������ tmp���� ���� / x��� ���� �ε��� �� / y��� ���� �ε��� ��
			temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
