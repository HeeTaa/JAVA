
public class Exam03_Remove {
	public static void main(String[] args) {

		// ���ǹ� �Ἥ arr�迭�� 1�� �ε���(2��°�)�� ���� ������ �ε����� �Űܴ��.
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int[] temp = new int[arr.length - 1];

		for (int i = 0, j = 0; i < arr.length; i++) {
										  
			if (arr[i] == 2) {            //arr 1���ε����� 2��°��� ������ 
				continue;                 //�Ʒ� j++�� �ǳʶڴ�
			}
			temp[j++] = arr[i];           // j = i ���������� �����ϴٰ� ���� continue�� ���� j���� �������鼭 �о��   
		}
	}
}
